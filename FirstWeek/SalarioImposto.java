package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class SalarioImposto 
{
    public static void main(String[] args) 
    {
        double slrioBase = Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
        
        //salario com aumento de 5% 
        double slrioAumento = slrioBase * 1.05;
        
        //salario com impostos 
        double slrioImposto = slrioAumento * 0.93;
        
        
        //quantidade de impostos pagos
        double impostos = slrioAumento - slrioImposto;
        
        //valor do aumento
        double aumento = slrioAumento - slrioBase;
        
        JOptionPane.showMessageDialog(null, "O salario final com impostos = " + slrioImposto + "\nValor dos impostos: " + impostos + "\nValor do aumento: " + aumento);
    }
}
