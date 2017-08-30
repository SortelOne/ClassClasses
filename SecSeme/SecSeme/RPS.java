import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class RPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPS
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        //Rock is 1, Paper is 2, Scissors is 3
        int bestOfComputer = 0;
        int bestOfYou = 0;
        int you = 0;
        do{
            System.out.println("Rock Paper Scissors!\nInput 1 for Rock\nInput 2 for Paper\nInput 3 for Scissors\nInput 4 to quit");
            System.out.println("If you dont know how to play rock paper scissors you're out of luck!");
            int comp = gen.nextInt(3)+1;
            you = scan.nextInt();         
            if(you == 1&&comp == 1)
            {
                System.out.println("You both chose rock!");
            }
            else if(you == 1&&comp == 2)
            {
                System.out.println("You chose rock and the computer chose paper! You lost!");
                bestOfComputer++;
            }
            else if(you == 1&&comp == 3)
            {
                System.out.println("You chose rock and the computer chose scissors! You won!");
                bestOfYou++;
            }

            if(you == 2&&comp == 2)
            {
                System.out.println("You both chose paper!");
            }
            else if(you == 2&&comp == 1)
            {
                System.out.println("You won!");
                bestOfYou++;
            }
            else if(you == 2&&comp == 3)
            {
                System.out.println("You lost!");
                bestOfComputer++;
            }

            if (you == 3&&comp == 3)
            {
                System.out.println("You both chose scissors!");
            }
            else if (you == 3&&comp == 1)
            {
                System.out.println("You chose scissors and the computer chose rock!\nYou lost!");
                bestOfComputer++;
            }
            else if (you == 3&&comp == 2)
            {
                System.out.println("You chose paper and the computer chose rock! You won!");
                bestOfYou++;
            }
            System.out.println("\nYour score: " + bestOfYou);
            System.out.println("Computer Score: " +bestOfComputer + "\n");
        }while((you != 4) && (bestOfComputer <= 1) && (bestOfYou <= 1));
        if (bestOfYou == 2)
        {
            System.out.println("\nCongratulations! All you did was get lucky and guess the right number!");
        }
        else if (bestOfComputer == 2)
        {
            System.out.println("\nYou completly lost! You suck at guessing!");
        }
    }
}
