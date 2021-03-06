package adapter;


//1. 继承---类适配器
//真正的适配器，需要连接USB，连接网线
public class Adapter extends Cable implements NetToUSB {

    public void handleRequest() {
        super.request();
    }
}
