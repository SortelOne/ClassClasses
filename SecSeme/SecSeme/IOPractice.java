import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class IOPractice here.
 * 
 * @author (Jake Bales) 
 * @version (a version number or a date)
 */
public class IOPractice
{
    public static void writeToFile()
    {
        try{
            Scanner scan = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("SummerReadingList.txt"));
            String input = null;
            do{
                System.out.println("Enter an item to add it to the list (Type quit to quit)");
                input = scan.nextLine();
                if(!input.equals("quit"))
                    writer.write(input +"\r\n");
                //writer.write("The Rise of Nine\r\n");
                //writer.write("The Fall of Five\r\n");
                //writer.write("The Revenge of Seven\r\n");
                // writer.write("The Fate of Ten\r\n");
                // writer.close();
            }while(!input.equals("quit"));
            writer.close();
        }catch(IOException ex)
        {
            System.out.println("Try again you noob!");
            ex.printStackTrace();
        }
    }

    public static void readFromFile()
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("SummerReadingList.txt"));
            String line = null;
            do{
                line = reader.readLine();
                if(line !=null)
                    System.out.println(line);
            }while(line!=null);
            reader.close();
        }catch(IOException ex)
        {
            System.out.println("Try again you noob!");
            ex.printStackTrace();
        }
    }

    public static void printArray(ArrayList<String> kelson)
    {
        for(int i = 0; i < kelson.size(); i++)
        {
            System.out.println(kelson.get(i));
        }
    }
    
    public static void arrayToFile(ArrayList<String> kelson)
    {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("SummerReadingList.txt",true));
            for(int i = 0; i< kelson.size(); i++)
            {
                writer.write(kelson.get(i) + "\r\n");
            }
            writer.close();
        }catch(IOException ex) {
            System.out.println("There was a problem writing to the file.");
            ex.printStackTrace();
        }
    }
    
    public static void fileToArray(ArrayList<String> kelson)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("SummerReadingList.txt"));
            String line = null;
            do{
                line = reader.readLine();
                if(line !=null)
                    System.out.println(line);
            }while(line!=null);
            reader.close();
        }catch(IOException ex)
        {
            System.out.println("There was a problem reading this file.");
            ex.printStackTrace();
        }
    }
    
    public static void main(String[]args)
    {
        writeToFile();
        readFromFile();
        ArrayList <String> kelson = new ArrayList <String>();
        fileToArray(kelson);
        printArray(kelson);
    }
}
