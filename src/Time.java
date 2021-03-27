public class Time {
    private long tiempoInicio;
    private long tiempoFin;

    public void start() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void stop() {
        this.tiempoFin = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return this.tiempoFin - this.tiempoInicio;
    }
}
