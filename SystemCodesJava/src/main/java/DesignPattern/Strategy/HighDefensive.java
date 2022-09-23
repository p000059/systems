package DesignPattern.Strategy;

public class HighDefensive implements Tactic {

	@Override
	public String formation() {
		String tactic = "5-4-1";
		return tactic;
	}
}
