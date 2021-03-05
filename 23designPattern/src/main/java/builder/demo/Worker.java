package builder.demo;

public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }

    void buildA() {
        product.setBuildA("步骤1");
        System.out.println("步骤1");
    }

    void buildB() {
        product.setBuildB("步骤2");
        System.out.println("步骤2");
    }

    void buildC() {
        product.setBuildC("步骤3");
        System.out.println("步骤3");
    }

    void buildD() {
        product.setBuildD("步骤4");
        System.out.println("步骤4");
    }

    Product getProduct() {
        return product;
    }
}
