package factory.abstrctfactory;

public class Consumer {

    public static void main(String[] args) {

        PhoneProduct phone1 = new XiaoMiFactory().getPhone();
        PhoneProduct phone2 = new HuaWeiFactory().getPhone();

        phone1.start();
        phone1.shutdown();
        phone2.start();

    }

}
