package creational.proxy.myproxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
@SuppressWarnings("unused")
public class UserDao {
    private Aop aop;

    public void save() {

        aop.begin();
        System.out.println("DB:保存用户");
        aop.close();

    }
}
