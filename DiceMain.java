
public class DiceMain {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1;
		int roll2;
		
		int count = 0;
		
		do
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			
			int sum = roll1 + roll2;
			
			System.out.println("Dice values " + roll1 + " and " + roll2 + " = " + sum);
			
			count++;
		} while( roll1 != roll2 );
		
		System.out.println("The number of rolls it took to get roll1 to be equal to roll2: " + dice1.getNumRolls());
		
		

	}

}
