import java.util.ArrayList;

public class BigForest
{
    private ArrayList<Tree> trees;
    
    public BigForest()
    {
        this.trees = new ArrayList<>();
    }
    
    public void show() {
        for (Tree tree : this.trees) {
            tree.show();
        }
    }
    
    public void growOneYear() {
        for (Tree tree : this.trees) {
            tree.growOneYear();
        }
    }
    
    public void addTree(Tree tree) {
        this.trees.add(tree);
    }
    
    public void growManyYears(int years) {
        for (int i = 0; i < years; i++) {
            this.growOneYear();
            this.addTree(new Tree(10.0));
        }
    }
    
    public double averageHeight() {
        double height = 0;
        for (Tree tree : trees) {
            height += tree.getHeight();
        }
        
        return height / trees.size();
    }
}
