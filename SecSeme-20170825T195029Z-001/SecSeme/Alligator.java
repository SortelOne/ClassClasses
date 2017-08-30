import java.util.ArrayList;

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator
{
    // instance variables
    private int biteStrength;
    private int length;
    // 2 constructors
    public Alligator()
    {
        biteStrength = 3700;
        length = 10;
    }

    public Alligator(int b, int l)
    {
        biteStrength = b;
        length = l;
    }
    // setBiteStrength
    public void setbiteStrength(int b)
    {
        biteStrength = b;
    }
    // addLength
    public void addLength(int l)
    {
        length += l;
    }

    public String toString()
    {
        String output = "\nLength: " + length + "\nBite Strength: " + biteStrength;
        return output;
    }

    public static void main(String[]args)
    {
        ArrayList<Alligator> garrett = new ArrayList<Alligator>();
        for(int i=0; i<5; i++)
        {
            garrett.add(new Alligator());
        }
        garrett.add(new Alligator(4500, 15));
        // add a new alligator with 5000, 17 in position 1
        garrett.add(1, new Alligator (9001, 27));
        // remove the 4th alligator and print it out
        System.out.println("Removed" + garrett.remove(3));
        System.out.println(garrett);
    }
}
