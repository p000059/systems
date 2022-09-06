// Esse programa faz uso da expressão lambda obdecendo o princípio de que uma expressão lambda só pode ser especificada
// em um contexto em que um tido de destino seja definido. No caso abaixo, a expressão é atribuída à instância da Interface MyValue.
// É importante entender que não se cria uma expressão lambda para que essa seja colocada no código de forma aleatória.

package Interfaces;

import javax.swing.*;

public class ResultMyValue {

    public static void main(String[] args) {

        FunctionalInterface myValue = () -> 98.7; // Cria-se a referência à instância, em seguida uma expressão lambda é atribuida a essa referência de interface.
        JOptionPane.showMessageDialog(null,"Valor: " + myValue.getValue()); //Chamada do método único da interface MyValue.

        OneInputValue myParameterValue = (n) -> 1.0 / n; //Cria-se a referência à instância, em seguida uma expressão lambda é atribuida a essa referência de interface.
        JOptionPane.showMessageDialog(null, "Value: " + myParameterValue.getValue(4.0)); //Chama-se o método passando um parânetro.

        //Outros exemplos que seguem a mesma lógica:

        TwoInputValues myParameterMultValue = (x, y) -> x * y;
        JOptionPane.showMessageDialog(null, "Mult parameter: " + myParameterMultValue.getValue(4,6));

    }
}
