public class WeatherState {

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherState() {

        this.temperature = Double.NaN;
        this.humidity = Double.NaN;
        this.pressure = Double.NaN;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
