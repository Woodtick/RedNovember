package utillities;

import java.util.Random;

public class Dice
{	
	private byte roll;
	private Random random;
	
	public Dice()
	{
		random = new Random();
	}
	
	public byte getRoll()
	{
		return this.roll;
	}

	public int rollDice()
	{
		roll = (byte) ( ( Math.abs(random.nextInt()) % 10 ) + 1 );
		return roll;
	}
}
