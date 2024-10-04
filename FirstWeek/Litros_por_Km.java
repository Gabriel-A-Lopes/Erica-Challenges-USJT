package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class Litros_por_Km 
{
    public static void main(String[] args) 
    {
        //capturar valores de Litros e Quilometros
        double litros, km;
        //converter string em double
        litros = Double.parseDouble(JOptionPane.showInputDialog("Insira a litragem gasta na viagem: "));
        km = Double.parseDouble(JOptionPane.showInputDialog("Quanto Kms tu andou? "));
        //calcular litros gastos por Km
        double consumo = litros/km;
    
        //exibir valores
        JOptionPane.showMessageDialog(null, "O consumo final foi de " + consumo + "L/Km");
        
    }   
}
