
/**
 * Write a description of class Dog here.
 * 
 * @author (Jake Bales) 
 * @version (a version number or a date)
 */
public class Dog
{
    private String color;
    private String name;
    private int speed;
    private boolean isHungry;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        color = "tan";
        name = "Noodles";
        speed = 2;
        isHungry = true;
    }

    public Dog(String c, String n)
    {
        color = c;
        name = n;
        speed = 2;
        isHungry = true;
    }

    public String toString()
    {
        String output = "A " + color + " Corgi named " + name;
        output += "\nIt has a speed of " + speed + " and it is " + isHungry + " that it is hungry.";
        return output;
    }
    //Setter
    public void setName(String n)
    {
        name = n;
    }

    public void setColor(String c)
    {
        color = c;
    }
    //getter
    public String getName()
    {
        return name;
    }
    
    public String getColor()
    {
        return color;
    }

    public static void main(String[]args)
    {
        Dog noodles = new Dog();
        Dog moose = new Dog("brown", "Moose");
        Dog zuko = moose;
        System.out.println(noodles);
        //         System.out.println(moose);
        //         System.out.println(zuko);
        noodles.setName("Orzo");
        noodles.setColor("black");
        System.out.println(noodles.getName());
        System.out.println(noodles);
    }
}

