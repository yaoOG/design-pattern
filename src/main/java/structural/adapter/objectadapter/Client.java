package structural.adapter.objectadapter;

/**
 * @author zhuyao
 * @date 2019/09/04
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
