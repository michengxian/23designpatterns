package delegate.dynamicDemo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

//    public ProxyInvocationHandlerandler(UserService rent) {
//        this.service = rent;
//    }


    public void setService(UserService service) {
        this.target = service;
    }


    //生成得到代理类
    public Object getProxy(){
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
        return object;
    }


    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }


    public void log(String msg){
        System.out.println("【ProxyInvocationHandler】 执行了"+msg+"方法");
    }
}
