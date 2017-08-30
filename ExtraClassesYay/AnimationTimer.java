import java.awt.event.*;
import javax.swing.Timer;

public class AnimationTimer extends Timer implements ActionListener  
{
    //Send in an amount of milliseconds
    private AnimateWindow window;
    
    public AnimationTimer(AnimateWindow win,int millsec)
    {
        super(millsec, null);
        window = win;
        addActionListener( this );
    }
    
    //program this to call the method you would like executed
    public void actionPerformed( ActionEvent e )
    {
        window.act();
    }
        
}