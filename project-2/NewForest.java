public class NewForest
{
    private Tree[][] trees;
    private int n;
    
    public NewForest() {
        n = 4;
        trees = new Tree[n][n];
        trees[0][0] = new Ash();
        trees[1][1] = new Ash();
        trees[2][2] = new Ash();
        trees[3][3] = new Ash();
        trees[0][3] = new Birch();
        trees[1][2] = new Birch();
        trees[2][1] = new Birch();
        trees[3][0] = new Birch();
    }
    
    public Tree getTree(int i, int j) {
        if (i < n && j < n && i >= 0 && j >= 0) {
            return trees[i][j];
        }
        return null;
    }
    
    public void growOneYear() {
        for(int i = 0; i < trees.length - 1; i++) {
            for(int j = 0; j < trees[i].length - 1; j++) {
                if (getTree(i, j) != null) {
                    getTree(i, j).growOneYear(i, j, this);
                }
            }
        }
    }
}
