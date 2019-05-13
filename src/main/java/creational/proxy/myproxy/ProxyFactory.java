package creational.proxy.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
@SuppressWarnings("unused")
public class ProxyFactory {

    /**
     * 维护目标对象
     */
    private static Object target;

    /**
     * 维护关键点代码的类
     */
    private static Aop aop;

    public static Object getProxyInstance(Object target, Aop aop) {

        //目标对象和关键点代码的类都是通过外界传递进来
        ProxyFactory.target = target;
        ProxyFactory.aop = aop;

        return Proxy.newProxyInstance(
                ProxyFactory.target.getClass().getClassLoader(),
                ProxyFactory.target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        ProxyFactory.aop.begin();
                        Object returnValue = method.invoke(ProxyFactory.target, args);
                        ProxyFactory.aop.close();

                        return returnValue;
                    }
                }
        );
    }
}
