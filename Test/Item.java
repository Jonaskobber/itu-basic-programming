import java.lang.*;
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private int price;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String toString() {
        return toString25();
        // return name + ": " + price + " DKK";
    }
    
    public int digits() {
        Integer tempInt = new Integer(price);
        return tempInt.toString().length();
    }
    
    public String toString25() {
        String string25 = "";
        string25 += name + ": ";
        for(int i = 0; i < 25 - (name.length() + digits() + 6); i++) {
            string25 += " ";
        }
        string25 += price + " DKK";
        return string25;
    }
}
