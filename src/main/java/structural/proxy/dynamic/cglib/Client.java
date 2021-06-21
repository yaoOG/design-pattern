package structural.proxy.dynamic.cglib;


/**
 * @author zhuyao
 * @date 2019/03/28
 *
 * 定义：为其他对象提供一种代理，以控制对这个对象的访问
 * 代理对象在客户端和目标对象之间起到中介的作用。
 *
 * 类型：结构型
 * 保护目标对象、增强目标对象
 * 优点：
 * 1.代理模式能够将代理对象与真实被调用的目标对象相分离
 * 2.可以保护目标对象
 * 3.对目标对象的方法进行增强。
 * 4.一定程度降低了系统的耦合度
 * 缺点：
 * 1.代理模式会造成系统设计中类的数目增加。
 * 2.在客户端和目标对象增加一个代理对象，会造成请求速度变慢。
 * 扩展：
 * 1.静态代理
 * 2.动态代理（代理接口）
 * 3.CGlib代理（代理类）（关注final修饰符）
 *
 * Spring的代理选择：
 * 当Bean有实现接口时，使用JDK动态代理。
 * 当Bean没有实现接口时，使用CGLib代理。
 * 也可以强制使用CGLib。
 *
 * 代理速度：
 * CGLib
 * jdk动态代理
 *
 * 相关设计模式：
 * 代理模式和装饰者模式
 * 代理模式和适配器模式
 */
public class Client {

    public static void main(String[] args1) {
        Client client = new Client();
        CglibProxy cglibProxy = new CglibProxy();
        client.cglibHandler(cglibProxy);
    }

    public void cglibHandler(CglibProxy cglibProxy) {
        CglibProxy proxyInstance = (CglibProxy) new CglibProxyFactory(cglibProxy).getProxyInstance();
        proxyInstance.coding();
    }
}
