package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class IdadeAtual 
{
    public static void main(String[] args) 
    {
        int anoNasc, anoAtual, idade;
        
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento no seguinte formato (yyyy)."));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual no seguinte formato (yyyy)."));
        
        idade = anoAtual - anoNasc;
        
        int aniversario = JOptionPane.showConfirmDialog(null, "Voce fez aniversario?");
        
        switch (aniversario) 
        {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Voce tem " + idade + " anos de idade");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Voce tem " + (idade - 1) + " anos de idade");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Operação cancelada", "Operação cancelada", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                break;
        }
    }
}
