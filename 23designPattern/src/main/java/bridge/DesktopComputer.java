package bridge;

public class DesktopComputer extends Computer {

    public DesktopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void computerInfo() {
        super.computerInfo();
        System.out.println("台式机");
    }
}
