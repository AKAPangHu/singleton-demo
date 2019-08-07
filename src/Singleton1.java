/**
 * 1.懒汉式 经典
 * 懒汉式均为线程安全，实现简单，但缺点是有可能浪费空间和牺牲启动时间
 *
 *
 *
 *
 * @author: 胖虎
 * @date: 2019/8/7 17:46
 **/
public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){

    }


}
