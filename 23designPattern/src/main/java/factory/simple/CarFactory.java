package factory.simple;

/**
 * 静态工厂模式
 * 增加一个新的产品，如果不修改代码是做不到的
 */

public class CarFactory {

    public static Car getCar(String name){
        if (name.equals("五菱宏光")){
            return new WuLing();
        }
        else if (name.equals("特斯拉")){
            return new Tesla();
        }
        return null;
    }

}
