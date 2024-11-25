package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class ParOuImpar 
{
    public static void main(String[] args) 
    {
        int inpt;
        
        inpt = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        
        if (inpt % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "O numero e par");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "O numero e impar");
        }
    }
}
