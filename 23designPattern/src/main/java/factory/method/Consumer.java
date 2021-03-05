package factory.method;

public class Consumer {

    public static void main(String[] args) {

        Car car1 = new WuLingFactory().getCar();

        Car car2 = new TesLaFactory().getCar();

        car1.name();
        car2.name();
    }

}
