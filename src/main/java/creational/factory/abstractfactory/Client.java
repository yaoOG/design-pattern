package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class Client {
    public static void main(String[] args) {
        SystemFactory mFactory;
        UIController interfaceController;
        OperationController operationController;

        //Android
        mFactory = new AndroidFactory();
        //Ios
        mFactory = new IosFactory();
        //Wp
        mFactory = new WpFactory();

        interfaceController = mFactory.createInterfaceController();
        operationController = mFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }
}
