package structural.proxy.dynamic.jdk2;


/**
 * @author zhuyao
 */
public class Client {
    public static void main(String[] args) {
       Client client = new Client();
        final JdkProxy jdkProxy = new JdkProxy();
        client.jdkProxyHandler(jdkProxy);
    }
    public void jdkProxyHandler(final JdkProxy jdkProxy) {
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(jdkProxy);
        JdkProxyInterface jdkProxyInterfaceWaterArmy = (JdkProxyInterface) jdkProxyFactory.getProxyInstance();
        jdkProxyInterfaceWaterArmy.coding();
    }
}
