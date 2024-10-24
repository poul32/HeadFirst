package rb.bars.monitoring.service;

public interface Observer {
    void update(float temperature, float pressure);
}
