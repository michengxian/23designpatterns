package delegate.dynamicDemo03;

//房东
public class Landlord implements Rent {


    public void rent() {
        System.out.println("房东出租房子");
    }
}
