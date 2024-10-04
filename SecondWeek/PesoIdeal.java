package SecondWeek;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author GALop
 */
public class PesoIdeal 
{
    public static void main(String[] args) 
    {
        //declarar o array de opções
        DecimalFormat formato = new DecimalFormat("0.00");
        String opc[] = {"Masculino", "Feminino", "Outro"};
        //pegar a resposta 
        int selec = JOptionPane.showOptionDialog(null, "Escolha o seu sexo", "Sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura (Ex. 1.80)"));
        //fazer o calculo
        switch (selec) {
            case 0:
                {
                    double pesoIdeal = (72.7 * altura) - 58;
                    String numeroFormatado = formato.format(pesoIdeal);
                    JOptionPane.showMessageDialog(null, "O seu peso ideal e " + numeroFormatado + " Kg");
                    break;
                }
            case 1:
                {
                    double pesoIdeal = (62.1 * altura) - 44.7;
                    String numeroFormatado = formato.format(pesoIdeal);
                    JOptionPane.showMessageDialog(null, "O seu peso ideal e " + numeroFormatado + " Kg");
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null,"Não existe terceira opção", "WTF", JOptionPane.ERROR_MESSAGE);
                break;
        //output
        }
    }
}