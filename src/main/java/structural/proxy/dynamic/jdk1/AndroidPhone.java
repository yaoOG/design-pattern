package structural.proxy.dynamic.jdk1;

/**
 * @author zhuyao
 * 委托类
 */
public class AndroidPhone implements SellPhone {
    @Override
    public void sell() {
        System.out.println("Sell the AndroidPhone here");
    }
}
