package rb.bars.monitoring.service;

public class CurrentStateDisplay implements Observer, DisplayElement {
    private Subject subject;
    private float temperature;
    private float pressure;

    public CurrentStateDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Now temperature: " + temperature + ", pressure: " + pressure);
    }
}
