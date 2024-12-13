import uk.ac.soton.ecs.comp1206.labtestlibrary.datastructure.Tree;
import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.MinimumInTree;

import static java.util.Objects.isNull;

public class MinTree implements MinimumInTree {

    public int findMin(Tree tree) {
        if (isNull(tree.right()) && isNull(tree.left())) { // Base case
            return tree.getVal();
        } else if (isNull(tree.left())){
            return Math.min(tree.getVal(), findMin(tree.right()));
        } else if (isNull(tree.right())) {
            return Math.min(tree.getVal(), findMin(tree.left()));
        } else {
            // Compare minimum of both subtrees
            return Math.min(Math.min(tree.getVal(), findMin(tree.left())), Math.min(tree.getVal(), findMin(tree.right())));
        }
    }
}
