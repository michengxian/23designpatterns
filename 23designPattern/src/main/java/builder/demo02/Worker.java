package builder.demo02;

//具体的建造者
public class Worker extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    Builder builderA(String name) {
        product.setBuildA(name);
        return this;
    }

    Builder builderB(String name) {
        product.setBuildB(name);
        return this;
    }

    Builder builderC(String name) {
        product.setBuildC(name);
        return this;
    }

    Builder builderD(String name) {
        product.setBuildD(name);
        return this;
    }

    Product getProduct() {
        return product;
    }
}
