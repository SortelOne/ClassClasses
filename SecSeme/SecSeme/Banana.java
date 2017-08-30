import java.util.Scanner;

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana
{
    // instance variables - replace the example below with your own
    private String flavor; 
    private int scoops;
    private String toppings;
    private boolean hasBananas;

    /**
     * Constructor for objects of class Banana
     */
    public Banana()
    {
        flavor = "Vanilla";
        scoops = 3;
        toppings = "";
        hasBananas = true;
    }

    public Banana(String f, int s, String t, boolean b)
    {
        flavor = f;
        scoops = s;
        toppings = t;
        hasBananas = b;
    }

    public String toString()
    {
        String output = "";
        if(hasBananas)
        {
            output = "This " + flavor + " banana split has " + scoops + " scoops of ice cream.";
            output += "\nThe toppings are : " + toppings;
            output += "and it has bananas. It wouldn't be a banana split without bananas!";
        }
        else
        {
            output += "You suck.";
        }
        return output;
    }
    //setters
    public void setScoops(int s)
    {
        scoops = s;
    }

    public void setFlavor(String f)
    {
        flavor = f;
    }

    public void setBananas(boolean b)
    {
        hasBananas = b;
    }

    public void setToppings(String t)
    {
        toppings += t;
    }

    //getters
    public int getScoops()
    {
        return scoops;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public boolean getBananas()
    {
        return hasBananas;
    }

    public String getToppings()
    {
        return toppings;
    }

    public static void main(String[]args)
    {
        Banana mine = new Banana("Rocky Road",3, "walnuts, fudge, and Garrett, ",true);
        Banana yours = new Banana();        
        yours.setFlavor("Vanilla");
        yours.setToppings("chocolate and melted peanut butter, ");
        yours.setBananas(false);
        yours.setScoops(5);
        System.out.println(mine);
        System.out.println();
        System.out.println(yours);
        boolean bananas = mine.getBananas();
    }
}
