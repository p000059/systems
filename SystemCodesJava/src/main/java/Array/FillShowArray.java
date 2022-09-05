package Array;

import java.util.Scanner;


public class FillShowArray {

    public static void main(String[] args) {

    	int size = 5;
        int[] array = new int[size];
        try (Scanner scn = new Scanner(System.in)) {
			int i = 0;
			
			do{
			    System.out.print("Digite valores inteiros para preencher vetor: ");
			    array[i] = scn.nextInt();
			    i++;
			    
			}while(i < size);
		}
        System.out.println("\n");
        
        for(int j = 0; j < array.length; j++){
            System.out.println("Array[" + j + "] = " + array[j]);
        }
    }
}
