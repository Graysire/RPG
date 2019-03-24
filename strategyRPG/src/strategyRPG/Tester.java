package strategyRPG;

public class Tester {

	public static void main(String[] args) 
	{
		System.out.println("Testing Character Class get methods using rpgConstants");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getName());
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getHitDice() + " HD");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getNumTrained() + " Base Trained Skills");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getHeroic() + " heroism");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getBAB() + " BAB");
		String[] skills = rpgConstants.CHARACTER_CLASSES[0].getSkills();
		System.out.print("Class Skills: ");
		for(int i = 1; i < skills.length; i++)
		{
			System.out.print(skills[i - 1] +", ");
			if(i % 6 == 0)
			{
				System.out.print("\r");
			}
		}
		System.out.print(skills[skills.length - 1] + "\r");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getReflex() + " Reflex");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getFortitude() + " Fortitude");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getWill() + " Will");
		System.out.println(rpgConstants.CHARACTER_CLASSES[0].getForce() + " Base Force Points");
		
		/* Tests the dice roller, remove comments to use */ /*
		System.out.println("Testing Dice Roller");
		for(int i = 1; i < 101; i ++)
		{
			System.out.print(rpgDice.rollDice("2d2") + " ");
			if(i % 10 == 0)
			{
				System.out.print("\r");
			}
		} */
	}

}
