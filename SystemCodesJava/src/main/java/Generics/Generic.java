package Generics;

import javax.swing.*;

public class Generic<T> {

	private T objGeneric;

	// Constructor
	public Generic(T objGeneric) {
		this.objGeneric = objGeneric;
	}

	// Get and Set
	public T getObjGeneric() {
		return objGeneric;
	}

	public void setObjGeneric(T objGeneric) {
		this.objGeneric = objGeneric;
	}

	public Object showType() {
		return this.objGeneric.getClass().getName();
	}

	public static void main(String[] args) {

		Generic<Integer> objInteger = new Generic<Integer>(8);
		Generic<String> objString = new Generic<String>("Tipo Generíco String");

		JOptionPane.showMessageDialog(null,
				"Generics: \n\n" + "Type: " + objInteger.showType() + "\nValue: " + objInteger.getObjGeneric()
						+ "\n\nType: " + objString.showType() + "\nValue: " + objString.getObjGeneric());

	}

}
