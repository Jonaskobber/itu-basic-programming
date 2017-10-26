import java.util.*;
/**
 * Write a description of class Forest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Forest
{
    private ArrayList<Tree> trees;
    
    public Forest() {
        trees = new ArrayList<>();
    }
    
    public void initialize() {
        trees.add(new Ash());
        trees.add(new Ash());
        trees.get(1).age = 3;
        trees.get(1).height = 3;
        trees.add(new Beech());
        trees.add(new Beech());
        trees.get(3).age = 5;
        trees.get(3).height = 5;
    }
    
    public void growOneYear() {
        for(Tree tree : trees) {
            tree.growOneYear();
        }
    }
    
    public void show() {
        for(Tree tree : trees) {
            tree.show();
        }
    }
    
    public void growManyYears(int n) {
        for(int i = 0; i < n; i++) {
            growOneYear();
            show();
        }
    }
}
