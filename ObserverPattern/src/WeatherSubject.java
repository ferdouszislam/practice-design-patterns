import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{

    private List<Observer> observers;

    private WeatherState weatherState;

    public WeatherSubject() {
        this.observers = new ArrayList<>();
        this.weatherState = new WeatherState();
    }

    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o)) observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        if(weatherState == null) return;

        for (Observer observer: observers) {
            observer.update(weatherState);
        }
    }

    /**
     * this method gets called whenever
     * weather parameter reading updates
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * this method is added to manually set
     * weather parameters for testing
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.weatherState.setTemperature(temperature);
        this.weatherState.setHumidity(humidity);
        this.weatherState.setPressure(pressure);
        measurementsChanged();
    }

    public WeatherState getWeatherState() {
        return weatherState;
    }
}
