package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class AndroidFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }


    @Override
    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}
