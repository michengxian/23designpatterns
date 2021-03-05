package factory.method;

public class WuLingFactory implements CarFactory {

    public Car getCar() {
        return new WuLing();
    }
}
