package creational.decorate;

/**
 * @author zhuyao
 * @date 2019/03/25
 */
public class Shopping {

    public static void main(String[] args) {
        Person person = new Teenager();

        person = new Shirt(person);
        person = new Casquette(person);

        System.out.println(person.getDescription() + " ￥ " + person.cost());
    }

}
