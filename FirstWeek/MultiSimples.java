package FirstWeek;

import javax.swing.JOptionPane;
/**
 *
 * @author GALop
 */
public class MultiSimples 
{
    public static void main(String[] args) 
    {
        int inpt1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));       
        int inpt2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));       
        int inpt3 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));       
        
        int multi = inpt1 * inpt2 * inpt3;
        
        JOptionPane.showMessageDialog(null, "O valor final e = " + multi);
    }
}
