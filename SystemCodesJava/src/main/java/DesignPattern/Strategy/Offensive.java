package DesignPattern.Strategy;

public class Offensive implements Tactic {

	@Override
	public String formation() {
		
		String tactic = "4-3-3";
		return tactic;
	}
}
