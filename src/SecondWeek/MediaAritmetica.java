package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MediaAritmetica 
{
    public static void main(String[] args) 
    {
        //receber notas
        double nota1, nota2, mediaArit;
        
        do
        {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: "));
            if (nota1 < 0 || nota1 > 10)
            {
                JOptionPane.showMessageDialog(null, "Por favor, digite um valor entre 0 e 10", "Nota invalida", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (nota1 < 0 || nota1 > 10); 
        
        do
        {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2: "));
            if (nota2 < 0 || nota2 > 10)
            {
                JOptionPane.showMessageDialog(null, "Por favor, digite um valor entre 0 e 10", "Nota invalida", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (nota2 < 0 || nota2 > 10);

        
        mediaArit = (nota1 + nota2)/2;
        //validar se aluno foi aprovado ou não. Media deve ser > 6 para aprovar
        if (mediaArit >= 0 && mediaArit <= 4)
        {
            JOptionPane.showMessageDialog(null, "Voce esta reprovado", "Reprovação!", JOptionPane.ERROR_MESSAGE);
        }
        else if (mediaArit > 4 && mediaArit < 7)
        {
            JOptionPane.showMessageDialog(null, "Voce esta de recuperação");
        }
        //mostra nota final e estado do aluno
        else
            JOptionPane.showMessageDialog(null, "Parabens, voce foi aprovado");
    }
}
