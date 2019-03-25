package creational.decorate;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public abstract class Person {
    String description = "person";

    public String getDescription() {
        return description;
    }

    /**
     * 子类应该实现的方法
     *
     * @return cost
     */
    public abstract double cost();
}
