package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class MaiorAreaTri 
{
    public static void main(String[] args) 
    {
        double base[] = {0, 0, 0}, altura[] = {0, 0, 0}, area[] = {0, 0, 0};
        //receber valores dos usuários
        for (int i = 0; i < 3; i++)
        {
            base[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base " + (i + 1) + ": "));
            altura[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura " + (i + 1) + ": "));
            //calcular os valores
            area[i] = (base[i] * altura[i])/2;
        }
        //print no command line os valores originais
        for (int i = 0; i < 3; i++)
        {
            System.out.print(base[i]);
            System.out.print(" ");
            System.out.println(altura[i]);
            System.out.println(area[i]);
        }
        //verificar o maior valor
        bubble (area);
        //output
        JOptionPane.showMessageDialog(null, "O maior valor e = " + area[2]);
    }
    
    public static void bubble(double area[])
    {
        //tamanho do array
        int n = area.length;
        //loop externo - numero de casas a percorrer
        for(int i = 0; i < n-1; i++)
        {
            //loop interno - verificação de posição
            for(int j = 0; j < n - i - 1; j++)
            {
                //caso o numero no array seja maior que o próximo...
                if(area[j] > area[j+1])
                {
                    //...executar troca
                    double temp = area[j];
                    area[j] = area[j+1];
                    area[j+1] = temp;
                }
            }
        }
        
    }
}
