package creational.factory.factorymethod;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class Client {
    public static void main(String[] args) {
        ReaderFactory jpgReaderFactory = new JpgReaderFactory();
        Reader jpgReaderFactoryReader = jpgReaderFactory.getReader();
        jpgReaderFactoryReader.read();

        ReaderFactory pngReaderFactory = new PngReaderFactory();
        Reader pngReaderFactoryReader = pngReaderFactory.getReader();
        pngReaderFactoryReader.read();

        ReaderFactory factory = new GifReaderFactory();
        Reader reader = factory.getReader();
        reader.read();

    }
}
