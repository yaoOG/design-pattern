package structural.bridge;

/**
 * @author zhuyao
 * Abstraction 抽象类
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
