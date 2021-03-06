package adapter;

//客户端类：想上网，插不上网线
public class Computer {

    public void net(NetToUSB adapter){
     //上网的具体实现，找一个转接头

        adapter.handleRequest();

    }

    public static void main(String[] args) {

//        Computer computer = new Computer();//电脑
//        Cable cable = new Cable();//网线
//        Adapter adapter = new Adapter();//转接器
//        computer.net(adapter);

        Computer computer = new Computer();//电脑
        Cable cable = new Cable();//网线
        Adapter2 adapter = new Adapter2(cable);//转接器
        computer.net(adapter);

    }

}
