package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MediaSJT 
{
    public static void main(String[] args) 
    {
        int inpt1 = Integer.parseInt(JOptionPane.showInputDialog("Nota A1: "));       
        int inpt2 = Integer.parseInt(JOptionPane.showInputDialog("Nota A2: "));       
        int inpt3 = Integer.parseInt(JOptionPane.showInputDialog("Nota A3: "));       
        
        int multi = ((inpt1* 3) + (inpt2* 3) + (inpt3* 4))/10;
        
        JOptionPane.showMessageDialog(null, "Media final = " + multi);
    }
}
