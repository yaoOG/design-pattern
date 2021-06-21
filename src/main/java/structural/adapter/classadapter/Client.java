package structural.adapter.classadapter;

/**
 * @author zhuyao
 * @date 2019/09/04
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
