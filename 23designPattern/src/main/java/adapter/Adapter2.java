package adapter;


//2. 组合---对象适配器
//真正的适配器，需要连接USB，连接网线
public class Adapter2 implements NetToUSB {

    private Cable cable;

    public Adapter2(Cable cable) {
        this.cable = cable;
    }

    public void handleRequest() {
        cable.request();
    }
}
