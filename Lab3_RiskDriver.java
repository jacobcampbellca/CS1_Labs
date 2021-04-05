import java.util.Scanner;
import java.util.Random;

public class RiskDriver {
	public static void main(String[] args) {		
		
		Risk risk = new Risk();
		int attackerArmies, defenderArmies;
		attackerArmies = 0;
		defenderArmies = 1;
		
		Scanner input = new Scanner(System.in);
		while (attackerArmies < defenderArmies) {			
		
			System.out.println("ATTACKER ARMIES MUST BE GREATER THAN DEFENDER ARMIES");
			
			System.out.println("Enter number of attacker armies: ");
			attackerArmies = input.nextInt();
			System.out.println("");
			
			System.out.println("Enter number of defender armies: ");
			defenderArmies = input.nextInt();
			System.out.println("");
		}
		
		while (attackerArmies >= 4 && defenderArmies > 0) {
			
			System.out.println("=========================================================");
			System.out.println("NEW TURN");
			System.out.println("");
			
			Random random = new Random();
			int attackerDice1, attackerDice2, attackerDice3;
			int defenderDice1, defenderDice2;
			
			attackerDice1 = random.nextInt(7 - 1) + 1;
			attackerDice2 = random.nextInt(7 - 1) + 1;
			attackerDice3 = random.nextInt(7 - 1) + 1;
			System.out.println("Attackers Raw Roll: " + attackerDice1 + ", " + attackerDice2 + ", " + attackerDice3);
		
			defenderDice1 = random.nextInt(7 - 1) + 1;
			defenderDice2 = random.nextInt(7 - 1) + 1;
			System.out.println("Defenders Raw Roll: " + defenderDice1 + ", " + defenderDice2);
			System.out.println("");
		
			int attackerSorted1, attackerSorted2, attackerSorted3;		
			if (attackerDice1 >= attackerDice2 && attackerDice2 >= attackerDice3) {
				attackerSorted1 = attackerDice1;
				attackerSorted2 = attackerDice2;
				attackerSorted3 = attackerDice3;
			}
			else if (attackerDice1 >= attackerDice3 && attackerDice3 >= attackerDice2) {
				attackerSorted1 = attackerDice1;
				attackerSorted2 = attackerDice3;
				attackerSorted3 = attackerDice2;
			}
			else if (attackerDice2 >= attackerDice1 && attackerDice1 >= attackerDice3) {
				attackerSorted1 = attackerDice2;
				attackerSorted2 = attackerDice1;
				attackerSorted3 = attackerDice3;
			}
			else if (attackerDice2 >= attackerDice3 && attackerDice3 >= attackerDice1) {
				attackerSorted1 = attackerDice2;
				attackerSorted2 = attackerDice3;
				attackerSorted3 = attackerDice1;
			}
			else if (attackerDice3 >= attackerDice1 && attackerDice1 >= attackerDice2) {
				attackerSorted1 = attackerDice3;
				attackerSorted2 = attackerDice1;
				attackerSorted3 = attackerDice2;
			}
			else {
				attackerSorted1 = attackerDice3;
				attackerSorted2 = attackerDice2;
				attackerSorted3 = attackerDice1;
			}
			System.out.println("Attacker Adjusted Rolls From Highest to Lowest: " + attackerSorted1 + ", " + attackerSorted2 + ", " + attackerSorted3);
		
			int defenderSorted1, defenderSorted2;
			if (defenderDice1 >= defenderDice2) {
				defenderSorted1 = defenderDice1;
				defenderSorted2 = defenderDice2;
			}
			else {
				defenderSorted1 = defenderDice2;
				defenderSorted2 = defenderDice1;
			}
			System.out.println("Defender Adjusted Rolls From Highest to Lowest: " + defenderSorted1 + ", " +defenderSorted2);
			System.out.println("");
		
			if (defenderSorted1 >= attackerSorted1) {
				attackerArmies = attackerArmies - 1;
				risk.defenderFirstRollWin(attackerArmies);
			}
			else {
				defenderArmies = defenderArmies - 1;
				risk.attackerFirstRollWin(defenderArmies);
			}			
			if (defenderSorted2 >= attackerSorted2) {
				attackerArmies = attackerArmies - 1;
				risk.defenderSecondRollWin(attackerArmies);
			}
			else {
				defenderArmies = defenderArmies - 1;
				risk.attackerSecondRollWin(defenderArmies);
			}
			
			if (attackerSorted1 > defenderSorted1 && attackerSorted2 > defenderSorted2) {
				System.out.println("DEFENDERS LOSE 2 ARMIES");
			}
			else if (defenderSorted1 > attackerSorted1 && defenderSorted2 > attackerSorted2) {
				System.out.println("ATTACKERS LOSE 2 ARMIES");
			}
			else if(attackerSorted1 > defenderSorted1 && defenderSorted2 > attackerSorted2) {
				System.out.println("BOTH ATTACKERS AND DEFENDERS LOSE 1 ARMY");
			}
			else {
				System.out.println("BOTH ATACKERS AND DEFENDERS LOSE ONE ARMY");
			}
			
			System.out.println("Remaining attacker armies: " + attackerArmies);
			if (defenderArmies >= 0) {
				System.out.println("Remaining defender armies: " + defenderArmies);
			}
			else {
				System.out.println("Remaining defender armies: " + 0);
			}
			System.out.println("");
			
			
		}
		
		if (attackerArmies < 4 && defenderArmies == 0) {
			System.out.println("EVERYBODY IS DEAD");
		}
		else if (attackerArmies < 4) {
			System.out.println("DEFENDERS WIN!!!");
		}
		else {
			System.out.println("ATTACKERS WIN!!!");

		input.close();
		
		}
	}
}
