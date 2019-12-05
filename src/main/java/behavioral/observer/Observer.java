package behavioral.observer;

/**
 * @author zhuyao
 * @date 2019/12/05
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
