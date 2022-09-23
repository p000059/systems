package DesignPattern.Strategy;
import javax.swing.JOptionPane;

public class CPatternStrategy {

	public static void main(String[] args) {
		
		String tactic = new TacticsCalculator().calculator(new HighDefensive());
		
		JOptionPane.showMessageDialog(null, "Tática: " + tactic);
	}

}
