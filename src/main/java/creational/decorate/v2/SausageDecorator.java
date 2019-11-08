package creational.decorate.v2;

/**
 * @author zhuyao
 * @date 2019/11/08
 * ConcreteDecorator（具体装饰类）
 * 它是抽象装饰类的子类，负责向构件添加新的职责。
 * 每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }
    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }
    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}