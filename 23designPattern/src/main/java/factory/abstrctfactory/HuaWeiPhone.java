package factory.abstrctfactory;

public class HuaWeiPhone implements PhoneProduct {

    public void start() {
        System.out.println("华为-手机开机");
    }

    public void shutdown() {
        System.out.println("华为-手机关机");
    }

    public void callUp() {
        System.out.println("华为-手机打电话");
    }

    public void sendSMS() {
        System.out.println("华为-手机发短信");
    }

}
