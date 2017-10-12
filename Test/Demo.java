
/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
    public static void main(String args[]) {
        Menu menu = new Menu();
        Item burger = new Item("Stor Burger", 109);
        menu.addItem(burger);
        Item fries = new Item("Fries", 29);
        menu.addItem(fries);
        Item coke = new Item("Lille vand", 5);
        menu.addItem(coke);
        menu.show();
    }
}
