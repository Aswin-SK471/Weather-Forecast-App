public class WeatherModel {
    private String city;
    private double temperature;
    private double humidity;
    private String condition;

    public WeatherModel(String city, double temperature, double humidity, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
    public String getCondition() { return condition; }
}
