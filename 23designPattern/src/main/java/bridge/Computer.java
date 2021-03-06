package bridge;

//抽象的电脑类类型
public abstract class Computer {

    //组合，品牌 桥
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void computerInfo(){
        brand.info();//自带品牌
    }

}
