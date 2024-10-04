package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class AreaCirc 
{
    public static void main(String[] args) 
    {
        double pi = 3.14;
        
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio: "));
        
        double area = pi * (raio * raio);
        
        JOptionPane.showMessageDialog(null, "A area do circulo = " + area);
    }          
}
