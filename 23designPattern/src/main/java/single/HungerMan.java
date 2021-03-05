package single;

//饿汉单例
public class HungerMan {

    //如果有这种比较耗内存的代码，就会造成内存浪费
    private static byte[] bytes1 = new byte[1024*1024];

    private static HungerMan hungerMan = new HungerMan();

    private HungerMan(){

    }


    public static HungerMan getInstance(){
        return hungerMan;
    }

}
