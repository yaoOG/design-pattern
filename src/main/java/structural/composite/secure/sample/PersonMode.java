package structural.composite.secure.sample;

/**
 * @author zhuyao
 * @date 2019/11/14
 * 抽象构件抽象族员类
 */
public abstract class PersonMode {
    //人名
    private String name;
    //性别
    private String sex;
    //年龄
    private int age;

    public PersonMode(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //个人信息
    public String getPersonInfo() {
        String info = "姓名:" + name + "\t性别:" + sex + "\t年龄:" + age;
        return info;
    }
}