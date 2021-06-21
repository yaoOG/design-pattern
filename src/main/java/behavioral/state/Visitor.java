package behavioral.state;

/**
 * @author zhuyao
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);

    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
