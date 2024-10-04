package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class IdadeSeculo 
{
    public static void main(String[] args) 
    {
        //receber os numeros
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual (yyyy) ?"));
        
        //calcular o tempo ate o proximo seculo
        int nextSec = (anoAtual /100 + 1) * 100;
        int proxVir = nextSec - anoAtual;
        
        //calcular idade na proxima virada
        int idadeVir = idade + proxVir;
        
        JOptionPane.showMessageDialog(null, "Voce tera " + idadeVir + " anos na proxima virada do seculo");
    }
}
