/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecondWeek;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author GALop
 */
public class BonusNatal 
{
    public static void main(String[] args) 
    {
        DecimalFormat formato = new DecimalFormat("0.00");
        //receber sexo, tempo de casa e salario
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o sexo:\n\n1. Homem\n2. Mulher"));
        
        int tempoCasa = Integer.parseInt(JOptionPane.showInputDialog("Tempo de casa?"));
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salario: "));
                
        switch (sexo){
            //20% para alguem com 15 anos homem
            case 1:
                if (tempoCasa >= 15)
                {
                    double compensacao = salario * 0.20;
                    String compForm = formato.format(compensacao);
                    
                    double valorFinal = salario + compensacao;
                    String finalForm = formato.format(valorFinal);
                    
                    JOptionPane.showMessageDialog(null, "Valor compensacao = R$" + compForm);
                    JOptionPane.showMessageDialog(null, "Valor total + salario = R$" + finalForm);
                }
                else 
                {
                    double valorFinal = salario + 200;
                    String finalForm = formato.format(valorFinal);
                    
                    JOptionPane.showMessageDialog(null, "Compensacao + salario = R$" + finalForm);
                }
            //25% para alguem com 10 anos mulher
            case 2:
                if (tempoCasa >= 10)
                {
                    double compensacao = salario * 0.25;
                    String compForm = formato.format(compensacao);
                    
                    double valorFinal = salario + compensacao;
                    String finalForm = formato.format(valorFinal);
                    
                    JOptionPane.showMessageDialog(null, "Valor compensacao = R$" + compForm);
                    JOptionPane.showMessageDialog(null, "Valor total + salario = R$" + finalForm);  
                }
                else 
                {
                    double valorFinal = salario + 200;
                    String finalForm = formato.format(valorFinal);
                    
                    JOptionPane.showMessageDialog(null, "Compensacao + salario = R$" + finalForm);
                }
        }        
    }
}
