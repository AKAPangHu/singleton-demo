/**
 * 6.懒汉式 静态内部类
 * @author: 胖虎
 * @date: 2019/8/7 21:24
 **/
public class Singleton6 {

    private Singleton6(){

    }

    private static class Inner {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return Inner.INSTANCE;
    }
}
