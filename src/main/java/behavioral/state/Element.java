package behavioral.state;

/**
 * @author zhuyao
 */
public interface Element {
    void accept(Visitor visitor);
}
