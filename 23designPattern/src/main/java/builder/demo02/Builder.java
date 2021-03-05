package builder.demo02;

//建造者
public abstract class Builder {

    abstract Builder builderA(String name);
    abstract Builder builderB(String name);
    abstract Builder builderC(String name);
    abstract Builder builderD(String name);

    abstract Product getProduct();

}
