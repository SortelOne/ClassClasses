import java.util.ArrayList;

/**
 * Write a description of class ToDoList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToDoList
{
    public static void main(String[]args)
    {
        ArrayList<String> sean = new ArrayList<String>();
        sean.add("Brush Teeth");
        sean.add("Comb Hair");
        sean.add("Establish Communism");
        sean.add("Take over the World");
        sean.add("Eat Breakfast");
        System.out.println(sean);
        
        sean.add(0, "Exercise");
        sean.add(1, "Rise from the Dead");
        sean.add("Burn Kelson at the Stake");
        System.out.println();
        System.out.println(sean);
        
        System.out.println();
        if(!sean.isEmpty())
        {
            System.out.println(sean.remove(2));
            System.out.println(sean.remove("Comb Hair"));
        }
        System.out.println(sean);
        System.out.println();
        
        //size, indexOf, contains, get item in position 1
        System.out.println(sean.size());
        System.out.println(sean.indexOf("Burn Kelson at the Stake"));
        System.out.println(sean.contains("Exercise"));
        System.out.println(sean.get(1));
    }
}
