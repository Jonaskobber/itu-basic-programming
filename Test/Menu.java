import java.util.*;
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;

    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public int total() {
        int sum = 0;
        for(Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    
    public void show() {
        System.out.println("=========================");
        for(Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println("-------------------------");
        System.out.println(total() + " DKK");
        System.out.println("=========================");
    }
}
