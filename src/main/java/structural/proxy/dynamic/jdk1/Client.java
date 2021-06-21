package structural.proxy.dynamic.jdk1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhuyao
 */
public class Client {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AndroidPhone androidPhone = new AndroidPhone();
        InvocationHandler agency1 = new StoreA(iphone);
        InvocationHandler agency2 = new StoreA(androidPhone);
        SellPhone dynamicProxy1 = (SellPhone) Proxy.newProxyInstance(Iphone.class.getClassLoader(), Iphone.class.getInterfaces(), agency1);
        SellPhone dynamicProxy2 = (SellPhone) Proxy.newProxyInstance(AndroidPhone.class.getClassLoader(), AndroidPhone.class.getInterfaces(), agency2);
        dynamicProxy1.sell();
        dynamicProxy2.sell();
    }

}
