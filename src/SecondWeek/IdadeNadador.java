package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class IdadeNadador 
{
    public static void main(String[] args) 
    {
        //receber idade do nadador
        int idade = 0;
        
        while (idade <= 0)
        {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade: "));
            
            if (idade > 35)
            {
                JOptionPane.showMessageDialog(null, "Categoria - Master");
            }
            else if (idade <= 35 && idade > 20)
            {
                JOptionPane.showMessageDialog(null, "Categoria - Jovem");
            }
            else if (idade <= 20 && idade > 14)
            {
                JOptionPane.showMessageDialog(null, "Categoria - Adolescente");
            }
            else if (idade <= 14 && idade > 10)
            {
                JOptionPane.showMessageDialog(null, "Categoria - Junior");
            }
            else if (idade <= 10 && idade > 0)
            {
                JOptionPane.showMessageDialog(null, "Categoria - Infantil");
            }
            else
                JOptionPane.showMessageDialog(null, "Idade invalida", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //validar
    }
}
