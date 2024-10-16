package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class Equacao2grau 
{
    public static void main(String[] args) 
    {
        int[] coef = new int[3];
        //receber 3 coeficientes
        while (coef[0] ==0)
        {    
            for (int i = 0; i < 3; i++)
            {
                coef[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i+1) + "o numero:"));
            }            
            //erro caso A = 0
            if (coef[0] == 0)
            {
                JOptionPane.showMessageDialog(null, "A deve ser diferente de 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else
                break;
        }
        //mostrar rais real
        int x = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de x?"));
        
        int resultado = (coef[0] * (x * x)) + (coef[1] * x) + coef[2];
        
        
        JOptionPane.showMessageDialog(null, "O f(x) = " + resultado);
    }
    
}
