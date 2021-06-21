package creational.factory.easyfactory;

/**
 * @author zhuyao
 * @date 2019/02/21
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
