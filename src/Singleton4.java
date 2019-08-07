/**
 * 4.懒汉式 经典(线程不安全)
 * @author: 胖虎
 * @date: 2019/8/7 20:48
 **/
public class Singleton4 {

    private static Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
