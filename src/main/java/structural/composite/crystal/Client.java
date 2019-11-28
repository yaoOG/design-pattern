package structural.composite.crystal;

/**
 * @author zhuyao
 * @date 2019/11/14
 */
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
    }

    //通过递归遍历树
    public static void showTree(Component root) {
        for (Component c : root.getChildren()) {
            //叶子节点
            if (c instanceof Leaf) {
                c.operation();
            } else {
                //树枝节点
                showTree(c);
            }
        }
    }
}