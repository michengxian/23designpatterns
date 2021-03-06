package delegate.demo02;

public class UserServiceImpl implements UserService {


    public void add() {
        System.out.println("UserServiceImpl add 增加了一个用户");
    }

    public void delete() {
        System.out.println("UserServiceImpl delete 删除了一个用户");
    }

    public void update() {
        System.out.println("UserServiceImpl update 更新了一个用户");
    }

    public void query() {
        System.out.println("UserServiceImpl query 查询了一个用户");
    }
}
