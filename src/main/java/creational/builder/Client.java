package creational.builder;

/**
 *
 * @author zhuyao
 * 定义：将一个复杂对象的构建与表示相分离。
 * 适用场景：如果一个对象有非常复杂的内部结构并且想把复杂对象的创建和使用相分离
 * 优点：1.封装性好，创建和使用相分离  2.扩展性好，建造类之间独立，一定程度上解耦
 * 缺点：1.会产生多余的Builder对象 2.产品内部发生变化建造者都需要修改，成本较大。
 * 工厂模式和创建者模式的区别：
 *      当创建一个对象需要很多步骤的时候，需要使用创建者模式。
 *      简单的创建整个对象，使用工厂相关的模式。
 * 例子：
 * StringBuilder、Guava的ImmutableSet copyof、Guava的TokenCache、spring中的BeanDefinitionBuilder、mybatis的SqlSessionFactoryBuilder
 *
 */
public class Client {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);
    }
}