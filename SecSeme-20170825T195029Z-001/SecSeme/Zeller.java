import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Zeller here.
 * 
 * @author (Jake Bales) 
 * @version (1-23-17)
 */
public class Zeller
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int again = 0;
        do
        {
            runZellers();
            System.out.println("Do you want to run it again?\nType 1 to run again or type 2 to quit.");
            again = scan.nextInt();
        }while(again == 1);
    }

    public static void runZellers()
    {
        System.out.println("Zellers day of the week calculator! Put in the year,\nthe month, (as a number)\nand the day of the month");
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to continue....");
        scan.nextLine();
        boolean doneYear = false;
        boolean doneMonth = false;
        boolean doneDay = false;
        int again = 0;
        byte dotm = 0;
        byte month = 0;
        short year = 0;
        byte dow = 0;
        do
        {
            do{
                try{
                    System.out.println("Enter year");
                    year = scan.nextShort();
                    doneYear = true;
                }catch(java.util.InputMismatchException e)
                {
                    System.out.println("Thats not a good answer. Try again.");
                    scan.nextLine();
                }
            }while(!doneYear);

            do{
                try{
                    System.out.println("Enter month");
                    month = scan.nextByte();
                    doneMonth = true;
                }catch(java.util.InputMismatchException e)
                {
                    System.out.println("Thats not a good answer. Try again.");
                    scan.nextLine();
                }
            }while(!doneMonth);

            do{
                try{
                    System.out.println("Enter day");
                    dotm = scan.nextByte();
                    doneDay = true;
                }catch(java.util.InputMismatchException e)
                {
                    System.out.println("Thats not a good answer. Try again.");
                    scan.nextLine();
                }
            }while(!doneDay);
        }while(again == 1);
        dow = calcZellers(dotm, month, year);
        System.out.println("It will be a " + outputDay(dow));
        System.out.println("Freaking Kelson!");
    }

    public static byte calcZellers(byte q, byte m, short year)
    {
        if (m >=3 || m <=12)
        {

        }
        else if (m == 2)
        {
            m = 14;
            year--;
        }
        if (m == 1)
        {
            m = 13;
            year--;
        }
        short j = (short) (year/100);
        short k = (short) (year%100);
        return (byte) ((q+(26*(m+1))/10+k+(k/4)+j/4+5*j)%7);
    }

    public static String outputDay(byte dow)
    {
        String day = "null";
        switch(dow)
        {
            case 0:
            day = "Saturday!";
            break;
            case 1:
            day = "Sunday!";
            break;
            case 2:
            day = "Monday!";
            break;
            case 3:
            day = "Tuesday!";
            break;
            case 4:
            day = "Wednesday!";
            break;
            case 5:
            day = "Thursday!";
            break;
            case 6:
            day = "Friday!";
            break;
        }
        return day;
    }
}
