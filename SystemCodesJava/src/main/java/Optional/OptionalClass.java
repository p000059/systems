package Optional;

import java.util.Optional;

import javax.swing.JOptionPane;

public class OptionalClass {

	public Optional<Integer> changeNumber(String word){
		
		try {
			
			Integer number = Integer.valueOf(word);
			return Optional.of(number);
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}
	
	public Optional<Integer> checkIsPresent(String number){
		
		try {
			
			Integer objNumber = Integer.valueOf(number);
			return Optional.of(objNumber);
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
		
		OptionalClass optionalClass = new OptionalClass();
		String number = "1";
		
		
		Optional<Integer> optionalNumber = optionalClass.changeNumber(number);
		optionalNumber.ifPresent(n -> JOptionPane.showMessageDialog(null, n));
	}
}
