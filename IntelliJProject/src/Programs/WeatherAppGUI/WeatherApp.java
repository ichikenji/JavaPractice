// [HTTP STATUS REPSONSE CODES]
/*  [Level 200] : OK
    201 : Created
    202 : Accepted
    203 : Non-Authoritative Information
    204 : No Content 

    [Level 400] : Bad Request
    401 : Unauthorised
    402 : Forbidden
    403 : Not Found
    404 : Conflict

    [Level 500] : Internal Server Error
    501 : Not implemented
    502 : Bad Gateway
    503 : Service unavailable
    504 : Gateway Timeout
    505 : Network Timeout
*/  
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.Scanner;

// [Retrieve weather data from API - This backend logic will fetch the latest weather
//  data from the external API and return it. The GUI will 
//  display this data to the user]

public class WeatherApp {
    public static JSONObject getWeatherData(String locationName) {
        JSONArray locationData = getLocationData(locationName);
        return null;
    }
    
    // API call that takes in location entered and 
    //   returns geographic coordinates
    public static JSONArray getLocationData(String locationName) {
        // Replaces any whitespace in location name to + 
        //   to adhere to API's request format
        locationName = locationName.replaceAll(" ", "+");

        // Build API URL with location parameter
        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + locationName + 
                            "&count=10&language=en&format=json";
        
        try {
            // [HttpURLConnection Class]
            // HTTP client to make HTTP requests like the API call
            HttpURLConnection conn = fetchApiResponse(urlString);

            // Check repsonse status - [HTTP Status Codes]
            if (conn.getResponseCode() != 200) {
                System.out.println("Error: Could not connect to API");
                return null;
            } else {
                // Store the API response
                StringBuilder resultJson = new StringBuilder();
                Scanner reader = new Scanner(conn.getInputStream());    // Reads JSON data from API call
                // Read and store the resulting JSON data into the string builder
                while (reader.hasNext()) {
                    resultJson.append(reader.nextLine());
                }
                reader.close();
                conn.disconnect();  // Closes URL connection

                // Parse the JSON string into a JSON Object 
                //  To access the data more properly
                JSONParser parser = new JSONParser();
                JSONObject resultsJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));
                // Get the list of location data the API generates from the location name
                JSONArray locationData = (JSONArray) resultsJsonObj.get("results");
                return locationData;
            }
             
        } catch (Exception e) {
            e.printStackTrace();
            return null;    // Cound't find location
        }
    }

    private static HttpURLConnection fetchApiResponse(String urlString) {
        try {
            // Attempt to create connection
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set request method - [Types of API calls]
            //  [GET] /pet/{petId} : Find pet by ID
            //  [PUT] /pet : Update an existing pet
            //  [DELETE] /pet/{petId} : Delete a pet
            //  [POST] /pet/{petId}/uploadImage : Uploads an image
            conn.setRequestMethod("GET");
            // Connect to the API
            conn.connect();
            return conn;

        } catch (IOException e) {
            e.printStackTrace();
        } 
        return null;
    }
}