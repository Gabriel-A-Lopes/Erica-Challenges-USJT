package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class AreaTri 
{
        public static void main(String[] args) 
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
        int alt = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura: "));
        
        int area = (base * alt)/2;
        
        JOptionPane.showMessageDialog(null, "O valor da area = " + area);
    }
}
