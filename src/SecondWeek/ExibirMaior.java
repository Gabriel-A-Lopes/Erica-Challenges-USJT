package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class ExibirMaior 
{
    public static void main(String[] args) 
    {
        //pedir tamanho do array
        int tamArr = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do array?"));
        //recebimento do tamanho do array
        int numeros[] = new int[tamArr];
        
        //receber numeros para popular array
        for (int i = 0; i < tamArr; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        }
        //chamar função de ordenação
        bubble(numeros);
        //output
        String resultado = "Array ordenado: ";
        //encapsulamento de numeros em num
        for (int num:numeros)
        {
            //como o output vai ser mostrado
            resultado += num + " ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
    
    public static void bubble (int numeros[])
    {
        //tamanho do array
        int n = numeros.length;
        //loop externo - numero de casas a caminhar por tentativa
        for (int i = 0; i < n-1; i++)
        {
           //loop interno - casa atual onde o sort está
            for (int j = 0; j < n- i - 1; j++)
            {
                //condição para troca
                if(numeros[j] > numeros[j+1])
                {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }
}
