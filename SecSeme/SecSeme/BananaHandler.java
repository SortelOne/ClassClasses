import java.util.Random;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BananaHandler
{
    private int health;
    private int weapon;//1-Banana Gun, 2-Bananarang, 3-BananaSplit, 4-BananaSlice, 5-Banana
    private String wname;
    private String ename;
    private int damage;
    private int accuracy;
    private boolean isDead;
    private static int Round = 1;
    private static final int MAX_BANANAS = 5;
    public BananaHandler(String n)
    {
        health = 100;
        wname = "Banana";
        damage = 10;
        accuracy = 90;
        ename = n;
        isDead = false;
        System.out.println("Welcome to the battlefield!\nYou encounter a Banana Handler weilding a Banana!");
    }

    private void chooseWeapon()
    {
        Random gen = new Random();
        weapon = gen.nextInt(10)+1;
        int newWeapon;
        if(isDead == false)
        {
            if(weapon == 5)
            {
                newWeapon = gen.nextInt(6)+1;
                if(newWeapon == 1)
                {
                    wname = "Banana Gun";
                    damage = 20;
                    accuracy = 50;
                    System.out.println("The Banana Handler switched weapons!\nHe now has a " + wname + "!");
                }
                else if(newWeapon == 2)
                {
                    wname = "Bananarang";
                    damage = 20;
                    accuracy = 50;
                    System.out.println("The Banana Handler switched weapons!\nHe now has a " + wname + "!");
                }
                else if(newWeapon == 3)
                {
                    wname = "Banana Split";
                    damage = 50;
                    accuracy = 40;
                    System.out.println("The Banana Handler switched weapons!\nHe now has a " + wname + "!");
                }
                else if(newWeapon == 4)
                {
                    wname = "Banana Slice";
                    damage = 30;
                    accuracy = 90;
                    System.out.println("The Banana Handler switched weapons!\nHe now has a " + wname + "!");
                }
                else if(newWeapon == 5)
                {
                    wname = "Banana";
                    damage = 30;
                    accuracy = 90;
                    System.out.println("The Banana Handler switched weapons!\nHe now has a " + wname + "!");
                }
                else if(newWeapon == 6)
                {
                    int bananaphone = gen.nextInt(100)+1;
                    if(bananaphone == 1)
                    {
                        wname = "Banana Phone";
                        damage = 9001;
                        accuracy = 100;
                        System.out.println("The enemy found a banana phone. You're dead. Sorry.");
                    }
                }
            }
            else
            {
                System.out.println(ename + " decides not to switch weapons!");
            }
        }
        else
        {
            System.out.println("");
        }
    }

    //setters and getters

    public void bananaTree(int b)
    {
        health+=(10);
    }

    public boolean getDead()
    {
        return isDead;
    }

    public void loseHealth(int d)
    {
        System.out.println(ename + " took " + d + " damage!");
        health-=d;
        if(health<=0)
        {
            System.out.println("You killed the Banana Handler!");
            isDead = true;
        }
    }

    public int attack()
    {
        int d;
        Random gen = new Random();
        chooseWeapon();

        if(gen.nextInt(100)+1<=accuracy)
        {
            d=damage;
        }
        else
        {
            System.out.println("Miss!");
            d=0;
        }
        return d;
    }

    public String toString()
    {
        String output = ename + "'s Health: " + health;
        return output;
    }

    //Main Method

    public static void main(String[]args)
    {
        Random gen = new Random();
        BananaHandler sean = new BananaHandler("Sean");
        BananaHandler garrett = new BananaHandler("Garrett");
        int round = 0;
        do
        {
            round ++;
            System.out.println(round);
            System.out.println(garrett);
            System.out.println(sean);
            garrett.bananaTree(gen.nextInt(MAX_BANANAS));
            sean.bananaTree(gen.nextInt(MAX_BANANAS));
            garrett.loseHealth(sean.attack());
            sean.loseHealth(garrett.attack());
            System.out.println("\n");
        }while(!garrett.getDead() && !sean.getDead());
    }
}
