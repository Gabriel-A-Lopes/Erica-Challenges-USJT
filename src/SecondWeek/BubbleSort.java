package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.lopes
 */
public class BubbleSort 
{
    public static void main(String[] args) 
    {
        //perguntando o tamanho do array
        int tamArr = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do array? "));
        //recebimento do tamanho do array
        int[] numeros = new int[tamArr];
        
        for (int i = 0; i < tamArr; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        }
        //chamando função de ordenação
        bubble(numeros);
        //output
        String resultado = "Array ordenado: ";
        for(int num : numeros)
        {
            resultado += num + " ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    //função de ordenação do array original;
    public static void bubble(int[] numeros)
    {
        //tamanho do array
        int n = numeros.length;
        //loop externo - numero de execuções
        for (int i = 0; i < n-1; i++)
        {
            for (int local = 0; local < n - i - 1; local++)
            {
                if (numeros[local] > numeros[local + 1])
                {
                    int temp = numeros[local];
                    numeros[local] = numeros[local + 1];
                    numeros[local + 1] = temp;    
                }
            }
        }            
    }
}
