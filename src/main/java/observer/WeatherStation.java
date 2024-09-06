package observer;

public class WeatherStation extends Observable implements Runnable{
    private double temperature;
    private final double MAXTEMP = 40.0;
    private final double MINTEMP = -40.0;
    public WeatherStation() {
        this.temperature = MINTEMP + (MAXTEMP * 2) * Math.random();
    }

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(1500);
                double updatedTemperature = getTemperature() + (-1.0 + 2.0 * Math.random());
                if (updatedTemperature <= MAXTEMP && updatedTemperature >= MINTEMP){
                    setTemperature(updatedTemperature);
                    notifyObservers();
                }
            }
        } catch (InterruptedException e){
            System.out.println("Error: " + e);
        }

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
