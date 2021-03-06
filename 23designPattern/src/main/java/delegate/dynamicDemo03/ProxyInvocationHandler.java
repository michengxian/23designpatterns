package delegate.dynamicDemo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public ProxyInvocationHandler(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
        return object;
    }


    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制
        System.out.println("【ProxyInvocationHandler】 "+method.getName());
        Object invoke = method.invoke(rent, args);
        return invoke;
    }
}
