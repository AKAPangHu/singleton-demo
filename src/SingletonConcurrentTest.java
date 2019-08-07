import java.util.concurrent.*;

/**
 * @author: 胖虎
 * @date: 2019/8/7 21:37
 **/
public class SingletonConcurrentTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test1();
        test2();
        test3();
    }

    private static void test3() throws InterruptedException, ExecutionException {
        Callable<Singleton6> c = new Callable<Singleton6>() {
            @Override
            public Singleton6 call() throws Exception {
                return Singleton6.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton6> f1 = es.submit(c);
        Future<Singleton6> f2 = es.submit(c);
        System.out.println("--3--");
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }

    private static void test2() throws InterruptedException, ExecutionException {
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);
        System.out.println("--2--");
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }

    private static void test1() throws InterruptedException, ExecutionException {
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);
        System.out.println("--1--");
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }

}
