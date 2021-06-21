package structural.proxy.dynamic.jdk1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhuyao
 * 中间类
 */
public class StoreA implements InvocationHandler {

    /**
     * 中间类持有委托类对象的引用,这里会构成一种静态代理关系
     */
    private Object phoneType;

    public StoreA(Object phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        //写入扩展逻辑
        System.out.println("Trading began! The store is " + this.getClass().getSimpleName());
        //实际代理的方法逻辑
        method.invoke(phoneType, args);
        System.out.println("Trading end!");
        return null;
    }

}
