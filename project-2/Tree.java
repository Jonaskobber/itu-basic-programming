
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    public int age;
    public double height;
    
    public void growOneYear() {
        age += 1;
    }
    
    public void show() {
        System.out.println("alder = " + age + " år og højde = " + height + " meter");
    }
    
    public double getHeight() {
        return height;
    }
    
    public double shadow(int i, int j, NewForest forest) {
        int k = 0;
        if (forest.getTree(i, j) != null) {
            double treeHeight = forest.getTree(i, j).getHeight();
            if (forest.getTree(i - 1, j) != null && forest.getTree(i - 1, j).getHeight() > treeHeight) k++;
            if (forest.getTree(i + 1, j) != null && forest.getTree(i + 1, j).getHeight() > treeHeight) k++;
            if (forest.getTree(i, j - 1) != null && forest.getTree(i, j - 1).getHeight() > treeHeight) k++;
            if (forest.getTree(i, j + 1) != null && forest.getTree(i, j + 1).getHeight() > treeHeight) k++;
        }
        return k/10.0;
    }
    
    public void growOneYear(int i, int j, NewForest forest) {
        double oldHeight = height;
        double diff = 0;
        
        growOneYear();
        
        diff = height - oldHeight;
        
        height = height - diff * shadow(i, j, forest);
    }
}
