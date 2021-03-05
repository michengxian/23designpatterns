package factory.simple;

public class Consumer {

    public static void main(String[] args) {

        //传统模式
//        Car car1= new WuLing();
//        Car car2 = new Tesla();

        //简单工厂模式
        Car car1= CarFactory.getCar("五菱宏光");
        Car car2 = CarFactory.getCar("特斯拉");

        car1.name();
        car2.name();
    }

}
