package builder.demo02;

public class Test {

    public static void main(String[] args) {

        //服务员
        Worker worker = new Worker();
        System.out.println(worker.getProduct().toString());

        worker.builderA("鸡翅").builderB("全家桶");
        System.out.println(worker.getProduct().toString());
    }

}
