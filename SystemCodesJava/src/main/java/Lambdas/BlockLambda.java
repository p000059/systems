package Lambdas;
//Este programa mostra como é uma expressão lambda em um bloco.

import javax.swing.JOptionPane;

import Lambdas.Interfaces.IGenericInterface;

public class BlockLambda {

    public static void main(String[] args) {

        IGenericInterface<Integer> oneCondition = (side1, side2, side3) -> ((side1 == side2) && (side1 != side3));
        IGenericInterface<Integer> twoCondition = (side1, side2, side3) -> ((side1 == side3) && (side1 != side2));
        IGenericInterface<Integer> threeCondition = (side1, side2, side3) -> ((side3 == side2) && (side1 != side3));
        //Predicate predicate = (m)

        if(oneCondition.test(1, 1, 3) || twoCondition.test(1,3,2) || threeCondition.test(2,3,1)){
            JOptionPane.showMessageDialog(null, "Isósceles");
        }

        try{

        }
        catch (ArithmeticException e){

        }
    }
}
