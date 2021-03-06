package delegate.demo02;

public class Test {

    public static void main(String[] args) {

        UserServiceImpl userService =  new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setService(userService);
        proxy.add();



    }

}
