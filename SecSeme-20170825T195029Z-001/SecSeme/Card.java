
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private String suit;
    private int suitValue;
    private String rank;
    private int rankValue;
    public Card(String x,String y, int z, int a)
    {
        suit=x;
        rank=y;
        suitValue=z;
        rankValue=a;
    }

    public int cardValue()
    {
        return rankValue;
    }

    public String toString()
    {
        return (rank+ " of " + suit);
    }
}
