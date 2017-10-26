
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
}
