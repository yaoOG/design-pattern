package structural.composite.crystal;

import java.util.List;

/**
 * @author zhuyao
 * @date 2019/11/14
 */
public class Leaf extends Component {

    @Override
    public void add(Component component){
        //空实现
    }

    @Override
    public void remove(Component component){
        //空实现
    }

    @Override
    public List<Component> getChildren(){
        //空实现
        return null;
    }
}

