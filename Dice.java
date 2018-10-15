
public class Dice 
{
	private int numRolls;
	
	//constructors
	
	public Dice() 
	{
		numRolls = 0;
	}
	
	// methods 
	
	public int roll() 
	{
		int roll;
		numRolls++;
		roll = (int)(Math.random()*6)+1;
		
		return roll;
		
		
	}
	
	public int getNumRolls() 
	{
		return numRolls;
	}
	
	public void reset() 
	{
		numRolls = 0;
	}
}
