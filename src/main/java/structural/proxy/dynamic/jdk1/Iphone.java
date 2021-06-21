package structural.proxy.dynamic.jdk1;

/**
 * @author zhuyao
 * 委托类
 */
public class Iphone implements SellPhone {
    @Override
    public void sell() {
        System.out.println("Sell the Iphone here");
    }
}
