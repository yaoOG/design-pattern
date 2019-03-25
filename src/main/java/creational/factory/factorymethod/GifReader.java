package creational.factory.factorymethod;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class GifReader implements Reader {

    @Override
    public void read() {
        System.out.print("read gif");
    }
}