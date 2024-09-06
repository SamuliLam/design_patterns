package observer;

public class WeatherStationObserver implements Observer{
    private String name;
    private WeatherStation observable;
    public WeatherStationObserver(String name, WeatherStation observable) {
        this.name = name;
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Weather observer: " + name + " notified. Weather is now : " + String.format("%.3f", observable.getTemperature()) + " C");
    }

    public String getName(){
        return this.name;
    }
}
