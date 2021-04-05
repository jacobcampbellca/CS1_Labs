
public class Risk {
	
	private int attackerArmies;
	private int defenderArmies;
	
	public Risk() {
		attackerArmies = 0;
		defenderArmies = 0;
	}
	
	public Risk(int initialAttackerArmies, int initialDefenderArmies) {
		attackerArmies = initialAttackerArmies;
		defenderArmies = initialDefenderArmies;	
	}
	
	public void attackerFirstRollWin(int loss) {
		defenderArmies = defenderArmies - 1;
	}
	
	public void defenderFirstRollWin(int loss) {
		attackerArmies = attackerArmies - 1;
	}
	
	public void attackerSecondRollWin(int loss) {
		defenderArmies = defenderArmies - 1;
	}
	
	public void defenderSecondRollWin(int loss) {
		attackerArmies = attackerArmies - 1;
	}
}
