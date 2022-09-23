package DesignPattern.Strategy;

public class HighOffensive implements Tactic{

	@Override
	public String formation() {
		
		String tactic = "3-4-3";
		return tactic;
	}
}
