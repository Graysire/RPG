package strategyRPG;

public class Tester {

	public static void main(String[] args) 
	{
		System.out.println("Testing Character Class get methods using rpgConstants");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getName());
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getHitDice());
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getNumTrained());
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getHeroic());
		
		System.out.println("Testing Dice Roller");
		for(int i = 1; i < 101; i ++)
		{
			System.out.print(rpgDice.rollDice("2d2") + " ");
			if(i % 10 == 0)
			{
				System.out.print("\r");
			}
		}
	}

}
