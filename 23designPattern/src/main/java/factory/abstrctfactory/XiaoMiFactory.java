package factory.abstrctfactory;

public class XiaoMiFactory implements ProductFactory{


    public PhoneProduct getPhone() {
        return new XiaoMiPhone();
    }

    public RouterProduct getRouter() {
        return new XiaoMiRouter();
    }
}
