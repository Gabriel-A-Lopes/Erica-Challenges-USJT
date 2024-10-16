package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MaisVelho 
{
    public static void main(String[] args) 
    {
        String nome1 = JOptionPane.showInputDialog("Insira o nome 1: ");
        String nome2 = JOptionPane.showInputDialog("Insira o nome 2: ");
        //declaração dos vetores para cada ano
        int [] ano1 = new int [3];
        int [] ano2 = new int [3];
        //receber valores
        for (int i = 2; i >=0 ; i--)
        {
            if (i == 0)
            {
                ano1[i] = Integer.parseInt(JOptionPane.showInputDialog("Dia 1:"));
                ano2[i] = Integer.parseInt(JOptionPane.showInputDialog("Dia 2:"));
            }
            else if (i == 1)
            {
                ano1[i] = Integer.parseInt(JOptionPane.showInputDialog("Mes 1:"));
                ano2[i] = Integer.parseInt(JOptionPane.showInputDialog("Mes 2:"));
            }
            else if (i == 2)
            {
                ano1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ano 1:"));
                ano2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ano 2:"));
            }
            else
                JOptionPane.showMessageDialog(null, "Como?", "Parabens por quebrar o codigo", JOptionPane.ERROR_MESSAGE);
        }
        //validação do ano
        if (ano1[2] < ano2[2])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano2[0] + "/" + ano2[1] + "/" + ano2[2] + "\n\nSendo assim, o " + nome1 + " e mais velho");
        }
        else if (ano2[2] < ano1[2])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano1[0] + "/" + ano1[1] + "/" + ano1[2] + "\n\nSendo assim, o " + nome2 + " e mais velho");
        }
        else if (ano1[1] < ano2[1])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano2[0] + "/" + ano2[1] + "/" + ano2[2] + "\n\nSendo assim, o " + nome1 + " e mais velho");
        }
        else if (ano2[1] < ano1[1])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano1[0] + "/" + ano1[1] + "/" + ano1[2] + "\n\nSendo assim, o " + nome2 + " e mais velho");
        }
        else if (ano1[0] < ano2[0])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano2[0] + "/" + ano2[1] + "/" + ano2[2] + "\n\nSendo assim, o " + nome1 + " e mais velho");
        }
        else if (ano2[0] < ano1[0])
        {
            JOptionPane.showMessageDialog(null, "A data mais recente e " + ano1[0] + "/" + ano1[1] + "/" + ano1[2] + "\n\nSendo assim, o " + nome2 + " e mais velho");
        }
    }
}