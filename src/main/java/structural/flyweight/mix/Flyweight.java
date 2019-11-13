package structural.flyweight.mix;

/**
 * @author zhuyao
 * @date 2019/11/13
 * 抽象享元角色类
 */
public interface Flyweight {
    /**
     * 一个示意性方法，参数state是外蕴状态
     * @param state state
     */
     void operation(String state);
}