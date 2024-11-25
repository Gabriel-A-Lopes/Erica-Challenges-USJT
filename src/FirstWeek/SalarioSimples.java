package FirstWeek;


import javax.swing.JOptionPane;
/**
 *
 * @author GALop
 */
public class SalarioSimples 
{
    public static void main(String[] args) 
    {
        float inpt = Float.parseFloat(JOptionPane.showInputDialog("Salario atual: "));
        
        float salarioAumento = inpt * (float)1.25;
        
        JOptionPane.showMessageDialog(null, "Salario com aumento = " + salarioAumento);
    }
}
