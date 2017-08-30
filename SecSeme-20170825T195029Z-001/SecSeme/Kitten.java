
/**
 * Write a description of class Kitten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitten
{
    private String color;
    private String name;
    private boolean hateBlake;
    private int cuteness;
    private int lazy;

    /**
     * Constructor for objects of class Cat
     */
    public Kitten(String c, String n)
    {
        // initialise instance variables
        color = c;
        name = n;
        hateBlake = true;
        cuteness = 9001;
        lazy = 10;
    }
    
    public String toString()
    {
        String output = "Theres a " + color + " kitten named " + name + " that showed up! It hates blake, it has a cuteness level of " + cuteness + " and a lazyness level of " + lazy + ".";
        return output;
    }
    
    public static void main(String[]args)
    {
        Kitten puppy = new Kitten("black", "Puppy");
        System.out.println(puppy);
    }
}
