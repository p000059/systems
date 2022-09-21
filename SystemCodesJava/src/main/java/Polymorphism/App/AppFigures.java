package Polymorphism.App;

import javax.swing.JOptionPane;

import Polymorphism.Class.Square;
import Polymorphism.Class.Triangle;

public class AppFigures {

	public static void main(String[] args) {
		
		Square square = new Square();
		Triangle triangle = new Triangle();
		
		Double sideSquare = 4.0;
		Double sideOneTriangle = 4.0;
		Double sideTwoTriangle = 5.0;
		
		
		square.setName("Figure");
		square.setType("Square");
		
		triangle.setName("Figure");
		triangle.setType("Triangle");
		
		JOptionPane.showMessageDialog(null, 
				"Type: " + square.getType() 
				+ "\nSquare Area: " + square.calculateArea(sideSquare)
				+ "\n\nType: " + triangle.getType()
				+ "\nTriangle Area: " + triangle.calculateArea(sideOneTriangle, sideTwoTriangle)
		);

	}

}
