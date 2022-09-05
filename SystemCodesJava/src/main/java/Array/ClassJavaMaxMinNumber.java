package Array;
import javax.swing.JOptionPane;

public class ClassJavaMaxMinNumber {

	static int[] arrayFilled() {
		
		int[] array = {10, 38, 5, 64, 3, 8, 41, 97, 43, 2};
		
		return array; 
	}
	
    public static int findMax() {

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arrayFilled().length; i++) {

            if (arrayFilled()[i] > min) {
                min = arrayFilled()[i];
            }
        }
        
        return min;
    }

    public static int findMin() {

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < arrayFilled().length; i++) {

            if (arrayFilled()[i] < max) {
                max = arrayFilled()[i];
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
		
    	JOptionPane.showMessageDialog(null, "Maior número: " + findMax() + "\nMenor número: " + findMin());
	}
}
