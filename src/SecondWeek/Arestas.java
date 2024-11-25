package SecondWeek;

import javax.swing.JOptionPane;

/** 
 *
 * @author GALop
 */
public class Arestas 
{
    public static void main(String[] args) 
    {
        //declarar array de arestas
        double arestas[] = {0, 0, 0}; 
        //receber arestas
        for(int i = 0; i < 3; i++)
        {
            arestas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da aresta "+ (i + 1) + ":"));
            //condições
            if(arestas[i] == 0)
            {
                JOptionPane.showMessageDialog(null, "Nao foi possivel montar um triangulo com a aresta = 0", "ERROR!", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if(arestas[0] == arestas[1] && arestas[1] == arestas[2])
        {
            JOptionPane.showMessageDialog(null, "O triangulo e equilatero");
        }        
        else if(arestas[0] != arestas[1] && arestas[0] != arestas[2] && arestas[1] != arestas[2])
        {
            JOptionPane.showMessageDialog(null, "O triangulo e escaleno");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O triangulo e isoceles");
        }
    }
}
