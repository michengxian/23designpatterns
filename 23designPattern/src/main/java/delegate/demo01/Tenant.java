package delegate.demo01;

//租客
public class Tenant {

    public static void main(String[] args) {
        //代理一般会有一些附属操作，
        Delegate delegate = new Delegate(new Landlord());

        //不用面对房东，直接找中介就可以
        delegate.rent();
    }

}
