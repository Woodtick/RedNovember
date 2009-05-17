package utillities;

import java.util.Random;

public class Dice
{	
	private static byte roll;
	private static Random random;
	
	public static byte getRoll()
	{
		return roll;
	}

	public static byte rollDice()
	{
		roll = (byte) ( ( Math.abs(random.nextInt()) % 10 ) + 1 );
		return roll;
	}
}
