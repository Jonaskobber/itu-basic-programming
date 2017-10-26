
/**
 * Write a description of class Beech here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Birch extends Tree
{
    public Birch() {
        age = 1;
        height = 0.5;
    }

    public void growOneYear() {
        super.growOneYear();
        if (age < 65) {
            height = height * 1.06;
        }
    }
    
    public void show() {
        System.out.println("Bøg:");
        super.show();
    }
}
