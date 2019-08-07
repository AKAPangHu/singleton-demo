/**
 * 5.懒汉式 双重检锁
 * @author: 胖虎
 * @date: 2019/8/7 20:50
 **/
public class Singleton5 {

    /**
     * 加volatile关键字，防止指令重排带来的创建对象错误
     */
    private static volatile Singleton5 instance;

    public static Singleton5 getInstance() {
        //加快效率，防止将所有操作都锁住
        if (instance == null){
            //加锁
            synchronized (Singleton5.class){
                //防止在之前的中已经创建好了实例，却又去创建
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    private Singleton5(){

    }

}
