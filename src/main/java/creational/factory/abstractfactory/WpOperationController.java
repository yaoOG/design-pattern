package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class WpOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("WpOperationController");
    }
}
