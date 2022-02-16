public class Main {
    public static void main(String[] args) {

        WeatherSubject weatherSubject = new WeatherSubject();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherSubject);

        currentConditionsDisplay.display();

        weatherSubject.setMeasurements(25.50, 65, 120.0);

        currentConditionsDisplay.display();
    }
}
