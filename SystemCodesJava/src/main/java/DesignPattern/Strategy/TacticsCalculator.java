package DesignPattern.Strategy;

public class TacticsCalculator {

	public String calculator(Tactic tactic) {
		
		return tactic.formation();
	}
}
