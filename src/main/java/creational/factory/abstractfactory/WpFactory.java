package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class WpFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }


    @Override
    public UIController createInterfaceController() {
        return new WpUIController();
    }
}