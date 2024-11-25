package SecondWeek;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author GALop
 */
public class MediaUSJT 
{
    public static void main(String[] args) 
    {
        //criando o formatador de floats
        NumberFormat formatado = NumberFormat.getInstance();
        formatado.setMaximumFractionDigits(2);
        //receber notas de a1, a2 e 3 trabalhos a3
        float provas[] = new float [5];
        
        //loop para receber resposta dos alunos entre 0 e 10
        for (int i = 0; i < 2; i++)
        {
            provas[i] = -1;
            //loop das provas a1 e a2
            while (provas[i] < 0 || provas[i] > 30)
            {
                provas[i] = Float.parseFloat(JOptionPane.showInputDialog("Valor da nota A" + (i + 1) + ":"));
                
                if (provas[i] < 0 || provas[i] > 30)
                {
                    JOptionPane.showMessageDialog(null, "Por favor digite uma nota entre 0 e 30!", "Nota invalida", JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
        //loop da a3
        for (int i = 2; i < 5; i++)
        {
            provas[i] = -1;
            //loop das provas a1 e a2
            while (provas[i] < 0 || provas[i] > 40)
            {
                provas[i] = Float.parseFloat(JOptionPane.showInputDialog("Valor da nota do trabalho " + (i - 1) + ":"));
                
                if (provas[i] < 0 || provas[i] > 40)
                {
                    JOptionPane.showMessageDialog(null, "Por favor digite uma nota entre 0 e 4!", "Nota invalida", JOptionPane.ERROR_MESSAGE);
                }
            }  
        }        
        //calculo de media
        float media = (provas[0] + provas[1] + provas[2] + provas[3] + provas[4]) /10;
        
        //formatando nota
        String mediaFormat = formatado.format(media);
        
        //resultado final do usuario
        if (media >= 6 && media <= 10)
        {
            JOptionPane.showMessageDialog(null, "Voce foi aprovado! \n\n Media final: " + mediaFormat);
        }
        else if (media >= 4 && media <= 5)
        {
            JOptionPane.showMessageDialog(null, "Voce esta de exame! \n\n Media final: " + mediaFormat, "Exame", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Voce foi reprovado! \n\n Media final: " + mediaFormat, "Reprovado", JOptionPane.ERROR_MESSAGE);
         
    }
}
