import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class BlackJack here.
 * 
 * @author (Jake Bales and Garrett Benson) 
 * @version (a version number or a date)
 */
public class BlackJack
{
    private int moneyBD;
    private Deck myDeck;
    private ArrayList<Card> handOne;
    private ArrayList<Card> handTwo;

    public BlackJack()
    {
        myDeck = new Deck();
        handOne = new ArrayList<Card>();
        handTwo = new ArrayList<Card>();
    }

    public void setMoney(int m)
    {
        moneyBD = m;
    }

    public static int getMoney(int m)
    {
        System.out.println("You have $" + m);
        return m;
    }

    public void start()
    {
        int garrett;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to BlackJack!\nHow much money would you like to bet?\nBet 0 dollars to quit.");
        moneyBD = 100;

        String conner = "null";

        handOne.add(myDeck.takeCard());
        handOne.add(myDeck.takeCard());
        handTwo.add(myDeck.takeCard());
        handTwo.add(myDeck.takeCard());

        garrett = scan.nextInt();
        moneyBD=moneyBD-garrett;

        int cardOne = handOne.get(0).cardValue();
        int cardTwo = handOne.get(1).cardValue();
        int cardThree=0;
        int cardFour = 0;
        int cardTotal = cardOne+cardTwo+cardThree+cardFour;
        int ccard1 = handTwo.get(0).cardValue();
        int ccard2 = handTwo.get(1).cardValue();
        int ccard3=0;
        int ccard4=0;
        int ccardTotal = ccard1+ccard2+ccard3+ccard4;

        do
        {
            if(ccardTotal <= 15)
            {
                handTwo.add(myDeck.takeCard());
                handTwo.add(myDeck.takeCard());
                ccard3 = handTwo.get(2).cardValue();
                ccard4 = handTwo.get(3).cardValue();
                ccardTotal = ccard1+ccard2+ccard3+ccard4;
            }
        }while(ccardTotal < 15);
        if(garrett==0)
        {
            System.out.println("You're wimpy, but at least you didn't lose any money.");
        }
        else
        {
            //moneyBD=moneyBD-garrett;
            System.out.println("You now have $" + moneyBD + ".");
            System.out.println("The cards you have are a " + cardOne + " and a " + cardTwo);
            String ian = "null";
            do
            {
                System.out.println("Type hit to draw another card and type stay to stay where you are.");
                scan.nextLine();
                ian = scan.nextLine();
                if(ian.equals ("hit"))
                {
                    handOne.add(myDeck.takeCard());
                    cardThree = handOne.get(2).cardValue();
                    System.out.println("The new card you drew was a " + cardThree + ".");
                    cardTotal = cardOne+cardTwo+cardThree+cardFour;
                    if(cardOne + cardTwo + cardThree + cardFour >21)
                    {
                        System.out.println("You busted!");
                        return;
                    }
                    else
                    {
                        System.out.println("Your new total is " + cardTotal + ".");
                        System.out.println("Would you like to draw another card?\nType hit to draw another card and type stay to stay where you are.");
                        conner = scan.nextLine();
                        do{
                            if(conner.equals ("hit"))
                            {
                                handOne.add(myDeck.takeCard());
                                cardFour = handOne.get(3).cardValue();
                                System.out.println("The new card you drew was a " + cardFour + ".");
                                cardTotal = cardOne+cardTwo+cardThree+cardFour;
                            }
                            else if(conner.equals ("stay"))
                            {
                                System.out.println("Your final total is " + cardTotal + ".");
                            }
                            else
                            {
                                System.out.println("Looks like you mistyped or something. Try again.");
                            }
                        }while(!conner.equals("hit")&&!ian.equals("stay"));
                    }
                }
                else if (ian.equals ("stay"))
                {
                    System.out.println("The Computer had " + ccardTotal + " and you had " + cardTotal + ".");
                }
                else
                {
                    System.out.println("Looks like you mistyped or something. Try again.");
                }
            }while(!ian.equals("hit")&&!ian.equals("stay"));
            if(ccardTotal > cardTotal)
            {
                System.out.println("You lost");
            }
            else
            {
                System.out.println("You won!");
            }
        }
    }

    public static void main(String[]args)
    {
        BlackJack jake = new BlackJack();
        jake.start();
    }
}

