package creational.singleton;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            return new Singleton2();
        }
        return instance;
    }
}
