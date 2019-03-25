package creational.singleton;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    return new Singleton3();
                }
            }
        }
        return instance;
    }
}
