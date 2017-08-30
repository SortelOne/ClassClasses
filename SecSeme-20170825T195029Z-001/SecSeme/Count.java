
/**
 * Write a description of class Count here.
 * 
 * @author (Jake Bales) 
 * @version (2-21-17)
 */
public class Count
{
    private int count;
    private static int numOfCounters = 0;
    public final int ID_NUM = numOfCounters + 1;
    
    public Count()
    {
        count=0;
        numOfCounters++;
    }
    
    public static int getNumOfCounters()
    {
        return numOfCounters;
    }
    
    public void doUp()
    {
        count ++;
    }
    
    public void doDown()
    {
        count --;
    }
    
    public void reset()
    {
        count=0;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public String toString()
    {
        String output = "There are " + numOfCounters + " counters created.";
        output += "This counter number is: " + ID_NUM + ". The count is: " + count;
        return output;
    }
    
    public static void main (String[]args)
    {
        System.out.println(Count.numOfCounters);
        Count one = new Count();
        Count two = new Count();
        Count three = new Count();
        Count four = new Count();   
        Count five = new Count();
        Count six = new Count();
        Count seven = new Count();
        System.out.println(Count.numOfCounters);
        Count.numOfCounters +=10;
        System.out.println(Count.numOfCounters);
        System.out.println(Count.getNumOfCounters());
    }
}
