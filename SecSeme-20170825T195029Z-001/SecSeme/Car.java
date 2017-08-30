
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private boolean isOn;
    private int speed;
    private int direction;
    private int fuel;

    public Car()
    {
        isOn = false;
        speed = 0;
        direction = 1; //1 - North, 2 - East, 3 - South, 4 - West
        fuel = 10;
    }

    public void changeIgnition(boolean o)
    {
        isOn = !isOn;
        if(!isOn)
            speed = 0;
    }

    public void addFuel(int f)
    {
        fuel += f;
    }

    public void turn(String d)
    {
        if(isOn && (speed>0 || speed<0))
        {
            if(d.equals("left"))
            {
                direction --;
                if(direction == 0)
                    direction = 4;
            }
            else if(d.equals("right"))
            {
                direction ++;
                if(direction ==5)
                    direction = 1;
            }
        }
        else if(!isOn)
            System.out.println("FREAKING KELSON! YOU CANT TURN THE CAR WHEN ITS OFF!!");
        else if(speed==0)
        {
            System.out.println("FREAKING KELSON! THE CAR HAS TO BE MOVING TO TURN!!");
        }
    }

    public void stop()
    {
        speed = 0;
    }

    public int checkFuel()
    {
        return fuel;
    }

    public String toString()
    {
        String output = "";
        if(isOn)
            output += "Ignition: on\n";
        else
            output += "Ignition: off\n";
        output += "Speed: " + speed + "\n";
        output += "Direction: " +getDirection() + "\n";
        output += "Fuel: " + fuel + "\n";
        return output;
    }

    public String getDirection()
    {
        //1 - North, 2 - East, 3 - South, 4 - West
        if(direction == 1)
            return "North";
        else if(direction == 2)
            return "East";
        else if(direction == 3)
            return "South";
        else if(direction == 4)
            return "West";
        else
            return "Invalid direction";
    }

    public void changeSpeed(int s)
    {
        if(isOn)
        {
            speed += s;
            if(s>0)
                fuel -= 5;
            else if(s>0)
                fuel -= 2;
        }
    }
    
    public static void main(String[]args)
    {
        Car Henry = new Car();
        System.out.println(Henry.toString());
        System.out.println("\n");
        Henry.changeIgnition(true);
        Henry.changeSpeed(10);
        Henry.turn("left");
        Henry.turn("left");
        Henry.addFuel(50000);
        System.out.println(Henry.toString());
        System.out.println("\n");
        Henry.changeSpeed(500);
        Henry.turn("left");
        System.out.println(Henry.toString());
        System.out.println("\n");
        Henry.changeIgnition(false);
        Henry.turn("right");
        System.out.println(Henry.toString());
        System.out.println("\n");
    }
}

