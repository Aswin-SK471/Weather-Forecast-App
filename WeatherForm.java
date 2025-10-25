import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeatherForm extends JFrame {
    private JTextField cityField, tempField, humidityField, conditionField;
    private JButton saveBtn;

    public WeatherForm() {
        setTitle("Weather Logging System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("City:"));
        cityField = new JTextField();
        add(cityField);

        add(new JLabel("Temperature:"));
        tempField = new JTextField();
        add(tempField);

        add(new JLabel("Humidity:"));
        humidityField = new JTextField();
        add(humidityField);

        add(new JLabel("Condition:"));
        conditionField = new JTextField();
        add(conditionField);

        saveBtn = new JButton("Save Weather");
        add(new JLabel());
        add(saveBtn);

        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String city = cityField.getText();
                double temp = Double.parseDouble(tempField.getText());
                double humidity = Double.parseDouble(humidityField.getText());
                String condition = conditionField.getText();

                WeatherModel weather = new WeatherModel(city, temp, humidity, condition);
                WeatherDAO dao = new WeatherDAO();
                if (dao.saveWeather(weather)) {
                    JOptionPane.showMessageDialog(null, "Weather saved successfully!");
                    cityField.setText("");
                    tempField.setText("");
                    humidityField.setText("");
                    conditionField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving weather.");
                }
            }
        });

        setVisible(true);
    }
}
