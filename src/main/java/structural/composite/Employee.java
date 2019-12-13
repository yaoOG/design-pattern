package structural.composite;

/**
 * @author zhuyao
 * @date 2019/11/14
 * Component（组合对象）
 */
public interface Employee {

    void add(Employee employee);

    void remove(Employee employee);

    //省略其它方法,如 getChild
    void print();
}
