package structural.adapter;

/**
 * @author zhuyao
 * @date 2019/09/04
 *
 * 适配器模式 结构型
 * 定义：将一个类接口转换成客户期望的另一个接口
 *       使原本不兼容的类可以一起工作。
 *  角色：
 *      适配器类、适配者、目标抽象类
 *      适配器实现目标抽象类，在适配器中对适配者方法进行调用返回适配后的数据。
 *  适配器模式包含四个角色：
 *      目标抽象类定义客户要用的特定领域的接口；适配器类可以调用另一个接口，作为一个转换器，
 *      对适配者和抽象目标类进行适配，它是适配器模式的核心；适配者类是被适配的角色，它定义了一个已经存在的接口，
 *      这个接口需要适配；在客户类中针对目标抽象类进行编程，调用在目标抽象类中定义的业务方法。
 *  适用场景：
 *      已经存在的类，它的方法和需求不匹配时（方法结果相同或相似）。
 *      适配器模式不是软件设计阶段考虑的设计模式，是随着软件迭代造成功能类似而接口不相同的情况下的解决方案。
 *  优点：
 *      能提高类的透明性和复用性，现有的类复用但不需要改变。
 *      目标类和适配器类解耦，提高了扩展性
 *      符合开闭原则。
 *  缺点：
 *      适配器在系统编写过程中需要全面考虑，可能增加系统的复杂性。
 *      增加系统代码可读难度。
 *  扩展：对象适配器、类适配器
 *  和适配器模式相关的设计模式“
 *      外观模式、
 *  应用：
 *      1.jdk XmlAdapter
 *      2.spring aop AdvisorAdapter
 *      3.spring jpa JpaVendorAdapter
 *      4.springMVC HandlerAdapter 对不同的controller进行扩展
 */
public class Client {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
