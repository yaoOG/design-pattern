package structural.composite;

/**
 * @author zhuyao
 * @date 2019/11/14
 * Leaf（叶子对象）
 */
public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        //叶子节点，该方法不适用于当前类
    }

    @Override
    public void remove(Employee employee) {
        //叶子节点，该方法不适用于当前类
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.print("Name = " + this.name);
        System.out.println("\t\tSalary = " + this.salary);
        System.out.println("-------------");
    }
}
