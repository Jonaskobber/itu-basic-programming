public class Tree
{
    private int age;
    private double height;
    private double growthPct;

    public Tree(double growthPct)
    {
        this.age = 1;
        this.height = 0.25;
        this.growthPct = growthPct;
    }
    
    public void growOneYear() {
        this.age = this.age++;
        double newHeight = this.height * (1 + this.growthPct / 100);
        if (newHeight < 20) {
            this.height = newHeight;
        }
    }
    
    public void show() {
        System.out.println("alder = " + this.age + " og højde = " + this.height + " meter");
    }
    
    public double getHeight() {
        return this.height;
    }
}
