package structural.bridge.example;

/**
 * @author zhuyao
 * @date 2019/11/13
 */
public interface MessageImplementor {
    /**
     * 发送消息
     *
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
    void send(String message, String toUser);
}
