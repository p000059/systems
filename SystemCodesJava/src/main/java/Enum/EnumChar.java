package Enum;

import javax.swing.JOptionPane;

public class EnumChar {

	enum Status {

		ACTIVE('1'), INACTIVE('0');

		private char valueStatus;

		Status(char valueStatus) {
			this.valueStatus = valueStatus;
		}

		public char getValue() {
			return this.valueStatus;
		}
	}

	public static void main(String[] args) {

		Status status = Status.INACTIVE;
		char vStatus = status.getValue();

		JOptionPane.showMessageDialog(null,
				status.toString() + " = " + vStatus + "\nTipo = " + ((Object) vStatus).getClass().getSimpleName());
	}
}
