import java.util.ArrayList;

/**
 * Write a description of class World here.
 * 
 * @author (Jake Bales) 
 * @version (5/1/17)
 */
public class World
{
    public static void makeBananaSplits()
    {
        ArrayList<Banana> iceCream = new ArrayList<Banana>();
        iceCream.add(new Banana());
        iceCream.add(new Banana());
        iceCream.add(new Banana());
        iceCream.add(new Banana());
        iceCream.add(new Banana());
        
        System.out.println(iceCream);
        iceCream.get(0).setToppings("Chocolate, nuts, cherry, whip cream");
        
        iceCream.remove(0);
        
    }
    
    public static void main (String[]args)
    {
        
    }
}
