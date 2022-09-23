package IfElse;
import javax.swing.JOptionPane;

//Programa mostra uma estrutura de condição se/senão.

public class IfElseSimpleCheckNumber {

    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10: "));
        
        if(number < 10){
            
            JOptionPane.showMessageDialog(null, "Numero menor que 10 -> " + number);
        }
        else if(number == 10){
            
            JOptionPane.showMessageDialog(null, "Número igual a 10.");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Número digitado maior que 10 -> " + number);
        }
    }
}
