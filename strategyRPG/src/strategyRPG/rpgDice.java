package strategyRPG;

import java.util.Random;
/**
 * Class consisting of static methods to generate random numbers as if rolling dice
 * @author Grayson Hill
 *
 */
public class rpgDice 
{
	private static Random dieRoll= new Random();
	
	public static int rollDice(String dice)
	{
		int rollTotal = 0;
		for(int i = 0; i < getNumberOfDice(dice); i++)
		{
			rollTotal += dieRoll.nextInt(getNumberOfFaces(dice)) + 1;
		}
		return rollTotal;
	}
	
	/**
	 * gets the number of dice from a String XdY, equal to the minimum roll of the dice
	 * @param dice the dice phrase to be read
	 * @return the number of dice X from XdY
	 */
	public static int getNumberOfDice(String dice)
	{
		if(dice.contains("d"))
		{
			return Integer.parseInt(dice.substring(0, dice.indexOf('d')));
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * gets the number of sides on the dice from a String XdY
	 * @param dice the dice phrase to be read
	 * @return the number of sides on the dice Y from XdY
	 */
	public static int getNumberOfFaces(String dice)
	{
		if(dice.contains("d"))
		{
			return Integer.parseInt(dice.substring(dice.indexOf('d') + 1));
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * gets the maximum number dice XdY could roll
	 * @param dice the dice phrase to be read
	 * @return the maximum roll on the dice X * Y from XdY
	 */
	public static int getMaxRoll(String dice)
	{
		if(dice.contains("d"))
		{
			return getNumberOfFaces(dice) * getNumberOfDice(dice);
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * gets the average number rolled on dice XdY
	 * @param dice the dice phrase to be read
	 * @return the average roll rounded down
	 */
	public static int getAverageRoll(String dice)
	{
		if(dice.contains("d"))
		{
			return (int) (getNumberOfFaces(dice) * (getNumberOfDice(dice) / 2.0));
		}
		else
		{
			return -1;
		}
	}
}
