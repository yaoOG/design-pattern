package creational.decorate.v2;

/**
 * @author zhuyao
 * @date 2019/11/08
 */
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getDesc() + ", 销售价格: " + batterCake.cost());
    }
}