import javax.swing.*;
import java.awt.Color;

/**
 * Write a description of class Drawing here.
 *
 * @author (Jake Bales)
 * @version (a version number or a date)
 */
public class Drawing
{

    public static void main (String[]args)
    {
        //Window
        JFrame box = new JFrame("Framethingy");
        box.setBounds(30,30,1000,800);
        box.setLayout(null);
        box.setVisible(true);
        box.setDefaultCloseOperation(box.EXIT_ON_CLOSE);
        //Frame
        Rectangle frame = new Rectangle(15, 15, 700, 700);
        box.add(frame, 0);
        //background color sky thingy
        Rectangle bgcolorthingy = new Rectangle(30,30,670,670);
        bgcolorthingy.setBackground(Color.decode("#3399FF"));
        box.add(bgcolorthingy, 0);
        //Ground
        Rectangle ground = new Rectangle(30, 620, 670, 81);
        ground.setBackground(Color.decode("#3ca02c"));
        box.add(ground, 0);
        //Mountain
        Triangle mountain = new Triangle(200, 200, 0, 670, 670, 670);
        mountain.setBackground(Color.decode("#5432a3"));
        bgcolorthingy.add(mountain, 0);
        //Sun
        Oval sun = new Oval(0, 0, 100, 100);
        sun.setBackground(Color.decode("#efe22b"));
        bgcolorthingy.add(sun, 0);
        //Trunk
        Rectangle trunk = new Rectangle(400, -10, 10, 410);
        trunk.setBackground(Color.decode("#56391f"));
        ground.add(trunk, 0);
        //Leaves
        Triangle leaves = new Triangle(400, 625, 420, 650);
        leaves.setBackground(Color.decode("#5daf31"));
        bgcolorthingy.add(leaves, 0);
    }
    
}
