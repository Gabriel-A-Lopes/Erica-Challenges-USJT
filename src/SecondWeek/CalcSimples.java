package SecondWeek;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author GALop
 */
public class CalcSimples 
{
    public static void main(String[] args) 
    {
        //declaração de variaveis
        double num1, num2;
        //formatação dos numeros com virgula 
        DecimalFormat formatar = new DecimalFormat("0.00");

        //criação de opções de calculo
        String opc[] = {"Soma", "Subtracao", "Divisao", "Multiplicacao"};
        //receber opção de calculo e numeros
        int selec = JOptionPane.showOptionDialog(null, "Escolha uma operacao", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);  
   
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero: "));
        //se a escolha for x. fazer x calculo com os numeros do usuario
        switch (selec)
        {
            case 0:
                double soma = num1 + num2;
                String resultado = formatar.format(soma);
                    
                JOptionPane.showMessageDialog(null, "Soma = " + resultado);
                break;
                    
            case 1:
                double sub = num1 - num2;
                String resultado2 = formatar.format(sub);
                
                JOptionPane.showMessageDialog(null, "Subtracao = " + resultado2);
                break;
                
            case 2:
                double div = num1/num2;
                if(num2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "Nao existe divisao por 0 seu jegue", "Erro!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                else
                {
                String resultado3 = formatar.format(div);
                
                JOptionPane.showMessageDialog(null, "Divisao = " + resultado3);
                break;
                }
            case 3 : 
                double multi = num1 * num2;
                String resultado4 = formatar.format(multi);
                
                JOptionPane.showMessageDialog(null, "Multiplicacao = " + resultado4);
                break;
        }
    }
}