package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class IosFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }


    @Override
    public UIController createInterfaceController() {
        return new IosUIController();
    }
}

