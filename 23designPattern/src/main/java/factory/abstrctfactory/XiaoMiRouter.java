package factory.abstrctfactory;

public class XiaoMiRouter implements RouterProduct {


    public void start() {
        System.out.println("小米-路由器开启");
    }

    public void shutdown() {
        System.out.println("小米-路由器关闭");
    }

    public void openWifi() {
        System.out.println("小米-路由器打开wifi");
    }

    public void setting() {
        System.out.println("小米-路由器设置");
    }
}
