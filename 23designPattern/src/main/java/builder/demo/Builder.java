package builder.demo;

//抽象的建造者
public abstract class Builder {

    //步骤1
    abstract void buildA();
    //步骤2
    abstract void buildB();
    //步骤3
    abstract void buildC();
    //步骤4
    abstract void buildD();

    abstract Product getProduct();

}
