package structural.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
public class JdkProxyFactory {

    private static final String CODING = "coding";
    /**
     * 维护目标对象
     */
    private Object target;

    public JdkProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象创建代理对象
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {

            System.out.println("jdk proxy begin");
            // 如果是调用coding方法，那么水军就要点赞了
            if (CODING.equals(method.getName())) {
                System.out.println("增强coding方法");
                method.invoke(target, args);
            } else {
                // 如果不是调用coding方法，那么调用原对象的方法
                return method.invoke(target, args);
            }

            System.out.println("jdk proxy end");
            return null;
        });
    }


}
