import java.util.Scanner;

public class DiceMain2 
{
	final static int MIN_VALID_INPUT = 1;
	final static int MAX_VALID_INPUT = 12;
	

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll1;
		int roll2;
		
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number between 2 and 12 (inclusive): ");
		int sumInput = in.nextInt();
		in.nextLine();
		
		boolean keepGoing = true;
		
		if (sumInput <= MIN_VALID_INPUT) 
		{
			System.out.println("Invalid input");
			System.out.println("Please enter a valid value: ");
			sumInput = in.nextInt();
			in.nextLine();
		}
		else if (sumInput > MAX_VALID_INPUT) 
		{
			System.out.println("Invalid Input");
			System.out.println("Please enter a valid value: ");
			sumInput = in.nextInt();
			in.nextLine();
		}
		int sum;
		
		if (sumInput < MAX_VALID_INPUT && sumInput > MIN_VALID_INPUT) 
		{
			System.out.println("Valid :)");
			do
			{
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				
				sum = roll1 + roll2;
				
				System.out.println("Dice values " + roll1 + " and " + roll2 + " = " + sum);
				
				count++;
				
			} while( sum != sumInput );
			
			System.out.println("The number of rolls it took to the target sum: " + dice1.getNumRolls());
		}
	}

}
