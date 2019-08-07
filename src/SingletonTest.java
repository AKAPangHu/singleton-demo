/**
 * @author: 胖虎
 * @date: 2019/8/7 21:29
 **/
public class SingletonTest {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println(singleton1);
        System.out.println(singleton1);

        Singleton2 singleton2 = Singleton2.INSTANCE;
        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.hashCode());

        Singleton3 singleton3 = Singleton3.INSTANCE;
        System.out.println(singleton3);
        System.out.println(singleton3);
    }

}
