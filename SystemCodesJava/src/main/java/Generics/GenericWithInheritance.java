package Generics;

import javax.swing.JOptionPane;

public class GenericWithInheritance<T extends Number> {

	private T number;

	public GenericWithInheritance(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public Object readTypeT() {
		return this.getNumber().getClass().getName();
	}

	public static void main(String[] args) {

		GenericWithInheritance<Double> genericWithInheritance = new GenericWithInheritance<Double>(8.0);
		JOptionPane.showMessageDialog(null,
				"Type: " + genericWithInheritance.readTypeT() + "\nValue: " + genericWithInheritance.getNumber());
	}
}
