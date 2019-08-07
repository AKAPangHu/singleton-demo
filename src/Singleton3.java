/**
 * 3.懒汉式 静态代码块
 * @author: 胖虎
 * @date: 2019/8/7 20:36
 **/
public class Singleton3 {
    
    public static final Singleton3 INSTANCE;
    
    static {
        INSTANCE = new Singleton3();
    }
    
    private Singleton3(){
        
    }
    
    
}
