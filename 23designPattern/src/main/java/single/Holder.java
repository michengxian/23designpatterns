package single;

//内部类
public class Holder {

    private Holder(){

    }

    private static Holder getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
