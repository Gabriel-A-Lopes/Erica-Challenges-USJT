package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class CCs 
{
    public static void main(String[] args) 
    {
        //receber valores enquanto estiverem forem < 0
        int cc = 0;
        
        while (cc < 1)
        {
            cc = Integer.parseInt(JOptionPane.showInputDialog("Potencia do carro (cc): "));
            
            if (cc > 240)
            {
                JOptionPane.showMessageDialog(null, "Super production");
            }
            else if (cc <= 240 && cc > 120)
            {
                JOptionPane.showMessageDialog(null, "Production");
            }
            else if (cc <= 120 && cc > 0)
            {
                JOptionPane.showMessageDialog(null, "Sub production");
            }
            else
            JOptionPane.showMessageDialog(null, "CC invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
