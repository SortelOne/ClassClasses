/**
 * Write a description of class Lizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard
{
    public String color;
    public boolean hasTail = true;
    private String species;
    public int temp;
    public boolean isDead = false;
    public String name;

    public Lizard()
    {
        species = "generic";
        color = "sandy";
        name = "Lizzy";
    }

    public Lizard(String s, String c, String n)
    {
        species = s;
        name = n;
        color = c;      
    }

    //getters and setters
    public void setColor(String c)
    {
        color = c;
    }

    public String getColor()
    {
        return color;
    }

    public void setSpecies(String s)
    {
        species = s;
    }

    public String getSpeceis()
    {
        return species;
    }

    public void setHasTail(boolean t)
    {
        hasTail = t;
    }

    public boolean getTail()
    {
        return hasTail;
    }

    public void setTemp(int fc)
    {
        temp = fc;
    }

    public int getTemp()
    {
        return temp;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        String output = "";
        if (species == "Gecko")
        {
            System.out.println("You can switch to Geico and save 15% or more on car insurance.");
        }
        else
        {
            output += "You made a Lizard!";
            output += "He is a " + species + " that is " + color + " and is named " + name;
        }
        return output;
    }

    public static void main (String[]args)
    {
        Lizard Lizzy = new Lizard();
        Lizard Lozzo = new Lizard("Iguana", "Purple", "Brock");
        Lizard Geico = new Lizard("Gecko", "Green", "Geico");

        Lizzy.setSpecies("Blue-Bellied Leg Footer");
        Lizzy.setColor("Yellow");
        Lizzy.setName("Marvin");

        System.out.println(Lizzy);
        System.out.println(Lozzo);
        System.out.println(Geico);
    }
}