package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class SalarioComissao 
{
    public static void main(String[] args) 
    {
        double slrioFixo, comissao, valorVendas, slrioFinal;
        
        slrioFixo = Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
        valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Valor total das vendas"));
        
        comissao = valorVendas * 0.04;
        slrioFinal = slrioFixo + comissao;
        
        JOptionPane.showMessageDialog(null, "O seu salario final e de R$ " + slrioFinal + " e foi adicionada uma comissao de R$ " + comissao);
    }
}
