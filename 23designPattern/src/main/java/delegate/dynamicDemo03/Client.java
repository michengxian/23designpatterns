package delegate.dynamicDemo03;

public class Client {

    public static void main(String[] args) {
        //1、真实角色
        Landlord landlord = new Landlord();


        //2.1、代理角色，没有
        ProxyInvocationHandler handler = new ProxyInvocationHandler(landlord);
        //2.2、通过调用程序处理角色来处理我们要调用的接口对象
        Rent rent = (Rent)handler.getProxy();
        rent.rent();
    }

}
