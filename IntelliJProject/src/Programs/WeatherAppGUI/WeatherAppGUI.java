import javax.swing.*;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class WeatherAppGUI extends JFrame {
    private final String SEARCHBOX_IMG = "Programs\\WeatherAppGUI\\src\\assets\\search.png";
    private final String WEATHERCONDIITON_IMG = "Programs\\WeatherAppGUI\\src\\assets\\cloudy.png"; 
    private final String HUMITY_IMG = "Programs\\WeatherAppGUI\\src\\assets\\humidity.png";
    private final String WINDSPEED_IMG = "Programs\\WeatherAppGUI\\src\\assets\\windspeed.png";

    public WeatherAppGUI() {
        // [Setting up GUI and adding Title]
        super("Weather App");
        // [Configure GUI to end the program's process once it's been closed]
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // [Set the size of the GUI in pixels]
        setSize(450, 650);
        // [Load the GUI at the center of the screen]
        setLocationRelativeTo(null);

        // [Make the layout manager null to manually position
        //  the components within the GUI]
        setLayout(null);

        // [Prevent the GUI from being resizable]
        setResizable(false);

        AddGUIComponents();
    }

    private void AddGUIComponents() {
        // ----- [Search field] -----
        JTextField searchTextField = new JTextField();
        // [Set the location and size of the component]
        searchTextField.setBounds(15, 15, 351, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        // ----- [Search Button] -----
        JButton searchButton = new JButton(loadImage(SEARCHBOX_IMG));
        // [Change the cursor to the hand cursor when hovering over the button]
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        // ----- [Weather Image] -----
        JLabel weatherConditionImage = new JLabel(loadImage(WEATHERCONDIITON_IMG));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);

        // ----- [Temperature Text] -----
        JLabel temperatureText = new JLabel("19°C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.PLAIN, 48));
        
        // ----- [Center the text]
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);
        

        // ----- [Weather Condition Description]
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0, 405, 450, 36);
        weatherConditionDesc.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);



        // ----- [Humidity Image] -----
        JLabel humidityImage = new JLabel(loadImage(HUMITY_IMG));
        humidityImage.setBounds(15, 500, 74, 66);
        add(humidityImage);

        // ----- [Humidity Text]
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90, 500, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityText);


        // ----- [Windspeed Image] -----
        JLabel windspeedImage = new JLabel(loadImage(WINDSPEED_IMG));
        windspeedImage.setBounds(220, 500, 74, 66);
        add(windspeedImage);

        // ----- [Windspeed Text]
        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15kmn/h</html>");
        windspeedText.setBounds(310, 500, 85, 55);
        windspeedText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windspeedText);
    }   

    private ImageIcon loadImage(String resourcePath) {
        try {
            // [Read the image file from the path given]
            BufferedImage image = ImageIO.read(new File(resourcePath));
            // [Returns the image icon so that our component can render it]
            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("* An error occurred");
            e.printStackTrace();
        }
        System.out.println("* Could not find resource");
        return null;
    }

}
