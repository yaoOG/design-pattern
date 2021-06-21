package structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhuyao
 * @date 2019/03/28
 * 需要实现MethodInterceptor接口
 */
public class CglibProxyFactory implements MethodInterceptor {

    /**
     * 维护目标对象
     */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 给目标对象创建代理对象
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
        //1. 工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类(代理对象)
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {

        System.out.println("开始cglib代理.....");
        if ("coding".equals(method.getName())) {
            System.out.println("coding cglib");
        }
        if ("writing".equals(method.getName())) {
            System.out.println("writing cglib");
        }
        System.out.println("cglib代理结束.....");
        return method.invoke(target, args);
    }

}