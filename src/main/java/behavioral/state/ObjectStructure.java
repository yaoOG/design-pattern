package behavioral.state;

import java.util.ArrayList;

/**
 * @author zhuyao
 */
public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}
