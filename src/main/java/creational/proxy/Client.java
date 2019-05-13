package creational.proxy;


/**
 * @author zhuyao
 * @date 2019/03/28
 */
public class Client {

    public static void main(String[] args1) {

        final JdkProxy jdkProxy = new JdkProxy();
        CglibProxy cglibProxy = new CglibProxy();
        Client client = new Client();
        client.dynamicProxyHandler(jdkProxy);
//        client.cglibHandler(cglibProxy);
    }

    private void cglibHandler(CglibProxy cglibProxy) {
        CglibProxy proxyInstance = (CglibProxy) new CglibProxyFactory(cglibProxy).getProxyInstance();
        proxyInstance.coding();
    }

    private void dynamicProxyHandler(final JdkProxy jdkProxy) {
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(jdkProxy);
        JdkProxyInterface jdkProxyInterfaceWaterArmy = (JdkProxyInterface) jdkProxyFactory.getProxyInstance();
        jdkProxyInterfaceWaterArmy.coding();
    }
}
