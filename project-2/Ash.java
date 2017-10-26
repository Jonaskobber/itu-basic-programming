
/**
 * Write a description of class Ash here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ash extends Tree
{
    public Ash() {
        age = 1;
        height = 1.0;
    }
    
    public void growOneYear() {
        super.growOneYear();
        if (height < 15) {
            height = height * 1.2;
        }
    }
    
    public void show() {
        System.out.println("Ask:");
        super.show();
    }
}
