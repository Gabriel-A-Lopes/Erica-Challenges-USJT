package FirstWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MediaPonderada 
{
    public static void main(String[] args) 
    {
        float nota1, nota2, media;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota 2: "));
        
        media = ((nota1 * 2) + (nota2 *3))/5;
        
        JOptionPane.showMessageDialog(null, "Media final - " + media);        
    }
}
