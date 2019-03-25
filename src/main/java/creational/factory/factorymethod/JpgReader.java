package creational.factory.factorymethod;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class JpgReader implements Reader {

    @Override
    public void read() {
        System.out.print("read jpg");
    }
}
