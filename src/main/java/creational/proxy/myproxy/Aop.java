package creational.proxy.myproxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
public class Aop {
    public void begin() {
        System.out.println("开始事务");
    }
    public void close() {
        System.out.println("关闭事务");
    }
}
