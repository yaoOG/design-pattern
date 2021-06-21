package structural.proxy.myproxy;

/**
 * @author zhuyao
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.myProxyHandler();
    }

    private void myProxyHandler() {
        Aop aop = new Aop();
        UserDao userDao = new UserDao();
        UserDaoInterface proxyInstance = (UserDaoInterface) ProxyFactory.getProxyInstance(userDao, aop);
        proxyInstance.save();
    }
}
