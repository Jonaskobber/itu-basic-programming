public class Forest
{
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;

    public Forest()
    {
        this.tree1 = new Tree(10);
        this.tree2 = new Tree(25);
        this.tree3 = new Tree(40);
    }
    
    public void show() {
        this.tree1.show();
        this.tree2.show();
        this.tree3.show();
    }
    
    public void growOneYear() {
        this.tree1.growOneYear();
        this.tree2.growOneYear();
        this.tree3.growOneYear();
    }
}
