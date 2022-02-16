public class CurrentConditionsDisplay implements Observer, Display{

    private WeatherState weatherState;
    private Subject weatherSubject;

    public CurrentConditionsDisplay(Subject weatherSubject) {

        this.weatherState = new WeatherState();

        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void update(WeatherState weatherState) {
        this.weatherState = weatherState;
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherState.getTemperature()
                + " Degrees Celsius, " + weatherState.getHumidity() + "% humidity and "
                + weatherState.getPressure() + " Pascal air pressure");
    }
}
