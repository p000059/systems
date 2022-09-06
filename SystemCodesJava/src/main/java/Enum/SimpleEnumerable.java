package Enum;

import javax.swing.JOptionPane;

public class SimpleEnumerable {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"1 - " + Status.ACTIVE + "\n2 - " + Status.INACTIVE + "\n3 - " + Status.EMPTY);
	}

	public enum Status {

		ACTIVE, INACTIVE, EMPTY
	}
}
