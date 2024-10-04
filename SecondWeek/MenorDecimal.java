package SecondWeek;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MenorDecimal 
{
    public static void main(String[] args) 
    {
        DecimalFormat format = new DecimalFormat("0.00");
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
       
        if (num1 > num2)
        {
            String numeroFormatado = format.format(num2);
            JOptionPane.showMessageDialog(null, "O numero "+numeroFormatado + " e menor");
        }
        else if (num2 > num1)
        {
            String numeroFormatado = format.format(num1);
            JOptionPane.showMessageDialog(null, "O numero "+ numeroFormatado + " e menor");
        }
        else
           JOptionPane.showMessageDialog(null, "Os numeros sao iguais", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
