package single;

import java.lang.reflect.Constructor;

//懒汉单例
public class LazyMan {

    private static LazyMan lazyMan;

    private LazyMan(String s ,Integer i){
        System.out.println(Thread.currentThread().getName()+"ok");
    }


    //////////////////////////////////////////方式一////////////////////////////////////////////////////////

    //多线程下可能会出现问题
    public static LazyMan getInstance(){
        if (lazyMan == null) {
            lazyMan = new LazyMan("LazyMan",1);
        }
        return lazyMan;
    }

    //多线程方式调用
//    public static void main(String[] args) {
//        for (int i=0;i<100;i++) {
//            new Thread(() -> {
//                LazyMan.getInstance();
//            }).start();
//        }
//    }


    //////////////////////////////////////////方式二////////////////////////////////////////////////////////
    //双重检测锁模式，DCL懒汉式
    //极端情况下，也有可能出现问题
//    public static LazyMan getInstance1(){
//        if (lazyMan==null) {
//            synchronized (LazyMan.class) {
//                if (lazyMan == null) {
//                    lazyMan = new LazyMan();//不是一个原子性操作
//                    /**
//                     * 1. 分配内存空间
//                     * 2. 执行构造方法，初始化对象
//                     * 3. 把对象指向空间
//                     *
//                     * 我们需要执行的顺序是123
//                     * 可能执行的是132
//                     *
//                     * 第一次执行没有问题，第二次执行时，lazyMan没有完成构造
//                     */
//                }
//            }
//        }
//        return lazyMan;
//    }
//
//
    //////////////////////////////////////////方式三////////////////////////////////////////////////////////
    private volatile static LazyMan lazyMan1;

    public static LazyMan getInstance2(){
        if (lazyMan==null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan("LazyMan",1);//不是一个原子性操作
                }
            }
        }
        return lazyMan;
    }


    // 反射 破解单例
    public static void main(String[] args) throws Exception {
        LazyMan lazyMan1 = LazyMan.getInstance2();
        Constructor<LazyMan> lazyManConstructor = LazyMan.class.getDeclaredConstructor(String.class,int.class);
        lazyManConstructor.setAccessible(true);
        LazyMan lazyMan2 = lazyManConstructor.newInstance();
        if (lazyMan1==lazyMan2){
            System.out.println("1111");
        }
        else
        {
            System.out.println("2222");
        }
    }


}
