package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public interface SystemFactory {
    OperationController createOperationController();

    UIController createInterfaceController();
}
