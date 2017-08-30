import java.util.ArrayList;
import java.util.Random;
/**
 * This gives a program Cards
 * 
 * @author (Garrett Benson was here) 
 * @version (1.0)
 */
public class Deck
{
    private static ArrayList<Card> deck=new ArrayList<Card>();
    private static ArrayList<Card> hand=new ArrayList<Card>();
    
    public Deck()
    {
        setDeck();
    }

    //     public String toString()
    //     {
    //         return (rank+ " of " + suit);
    //     }

    public void setDeck()
    {
        String[] setSuit={"Hearts","Spades","Diamonds","Clubs"};
        String[] setRank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        for(int i=0;i<setSuit.length;i++)
        {
            for(int j=0;j<setRank.length;j++)
            {
                if(j>=9&&j<=11)
                deck.add(new Card(setSuit[i],setRank[j],(i+1),10));
                if(j==12)
                deck.add(new Card(setSuit[i],setRank[j],(i+1),11));
                else
                deck.add(new Card(setSuit[i],setRank[j],(i+1),(j+2)));
            }
        }
       
    }

    public Card takeCard()
    {
        Random gen=new Random();
        int num=gen.nextInt(deck.size());
        return deck.remove(num);
    }

    public void clearHand()
    {
        hand.clear();
    }

    public static void main(String[]args)
    {

    }

}