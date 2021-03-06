package delegate.demo02;


public class UserServiceProxy implements UserService {

    private UserServiceImpl service;

    //spring不推荐
//    public UserServiceProxy(UserServiceImpl service) {
//        this.service = service;
//    }

    //spring推荐
    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    public void add() {
        log("add");
        service.add();
    }

    public void delete() {
        log("delete");
        service.delete();
    }

    public void update() {
        log("update");
        service.update();
    }

    public void query() {
        log("query");
        service.query();
    }

    private void log(String msg){
        System.out.println("【UserServiceProxy】 代理模式日志 使用了"+msg+"方法");
    }

}
