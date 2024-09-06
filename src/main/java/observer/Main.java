package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherStationObserver observer1 = new WeatherStationObserver("Jaakko", weatherStation);
        WeatherStationObserver observer2 = new WeatherStationObserver("Stefanos", weatherStation);
        WeatherStationObserver observer3 = new WeatherStationObserver("Ismet", weatherStation);


        Thread thread = new Thread(weatherStation);
        thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e);
        }

        weatherStation.removeObserver(observer2);
        System.out.println("Removed observer " + observer2.getName() + " from observers. \n");

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e);
        }


        thread.interrupt();
    }
}
