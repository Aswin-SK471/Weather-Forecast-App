import java.sql.*;

import javax.swing.JOptionPane;

public class WeatherDAO {
    public boolean saveWeather(WeatherModel weather) {
        String sql = "INSERT INTO weather_log (city, temperature, humidity, `condition`) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, weather.getCity());
            ps.setDouble(2, weather.getTemperature());
            ps.setDouble(3, weather.getHumidity());
            ps.setString(4, weather.getCondition());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
    e.printStackTrace();   // Print the full SQL error in console
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); // Show error in GUI
    return false;
}

    }
}
