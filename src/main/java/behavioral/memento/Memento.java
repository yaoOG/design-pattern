package behavioral.memento;

/**
 * @author zhuyao
 * @date 2019/12/04
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}