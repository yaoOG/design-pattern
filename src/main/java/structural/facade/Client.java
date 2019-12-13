package structural.facade;

/**
 * @author zhuyao
 * @date 2019/09/04
 *
 * 外观模式  结构型
 * 定义：又叫门面模式，提供了一个统一接口，用来访问子系统中的一群接口。
 * 适用场景：
 *      子系统越来越复杂，增加外观模式提供简单调用接口。
 *      构建多层系统结构，利用外观对象作为每层的入口，简化层间调用。
 * 优点：
 *      1.简化了调用过程，无需深入了解子系统，降低了风险
 *      2.减少系统依赖，松散耦合
 *      3.更好的层次划分
 *      4.符合迪米特法则，即最少知道原则
 * 缺点：
 *      1.扩展子系统，增加子系统行为容易引发风险。
 *      2.不符合开闭原则。
 * 与外观模式相关的设计模式：
 *      中介者模式、单例模式、抽象工厂模式
 * 应用：
 *      1.spring中的JdbcUtils
 *      2.mybatis中的Configuration
 *      3.Tomcat中的RequestFacade,是HttpServletRequest的一个外观类
 */
public class Client {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}