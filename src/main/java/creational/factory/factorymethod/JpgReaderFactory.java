package creational.factory.factorymethod;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class JpgReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
