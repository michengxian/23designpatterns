package bridge;

public class LaptopComputer extends Computer {

    public LaptopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void computerInfo() {
        super.computerInfo();
        System.out.println("笔记本");
    }
}
