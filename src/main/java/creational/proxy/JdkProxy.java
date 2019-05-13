package creational.proxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
public class JdkProxy implements JdkProxyInterface {

    @Override
    public void coding() {
        System.out.println("Java3y最新文章：......给女朋友讲解什么是代理模式.......");
    }
}
