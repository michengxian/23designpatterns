package builder.demo;

//指挥:核心，只负责指挥构建一个工程，工程如何构建由他决定
public class Director {


    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
