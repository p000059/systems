package For.AppFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleMultiplicationTable {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i < 11; i++) {
        	
        	System.out.printf("%n" + N + " x " + i + " = " + N * i);
        }
        
        bufferedReader.close();

	}

}
