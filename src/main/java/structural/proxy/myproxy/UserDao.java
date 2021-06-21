package structural.proxy.myproxy;

/**
 * @author zhuyao
 * @date 2019/03/28
 */
@SuppressWarnings("unused")
public class UserDao implements UserDaoInterface {

    @Override
    public void save() {
        System.out.println("DB:保存用户");
    }
}
