package factory.method;

public class TesLaFactory implements CarFactory {

    public Car getCar() {
        return new TesLa();
    }
}
