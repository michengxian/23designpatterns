package factory.abstrctfactory;

public class HuaWeiFactory implements ProductFactory {


    public PhoneProduct getPhone() {
        return new HuaWeiPhone();
    }

    public RouterProduct getRouter() {
        return new HuaWeiRouter();
    }
}
