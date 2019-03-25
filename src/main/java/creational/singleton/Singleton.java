package creational.singleton;

/**
 * @author zhuyao
 * @date 2019/02/21
 */
@SuppressWarnings("unused")
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }

}
