package creational.factory.abstractfactory;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}
