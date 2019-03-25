package strategyRPG;

public class Tester {

	public static void main(String[] args) 
	{
		new StartLoader();
		
		System.out.println("Testing rpgConstants' Constants");
		for(int i = 0; i < rpgConstants.FEATS.size(); i++)
		{
			System.out.println(rpgConstants.FEATS.keySet().toArray()[i]);
			System.out.println("\t"+rpgConstants.FEATS.values().toArray()[i]);
		}
		for(int i = 0; i < rpgConstants.TALENTS.size(); i++)
		{
			System.out.println(rpgConstants.TALENTS.keySet().toArray()[i]);
			System.out.println("\t"+rpgConstants.TALENTS.values().toArray()[i]);
		}
		
		System.out.println("Testing Character Class get methods using rpgConstants");
		for(int i = 0; i < rpgConstants.CHARACTER_CLASSES.length; i++)
		{
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getName());
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getHitDice() + " HD");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getNumTrained() + " Base Trained Skills");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getHeroic() + " heroism");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getBAB() + " BAB");
			String[] skills = rpgConstants.CHARACTER_CLASSES[i].getSkills();
			System.out.print("Class Skills: ");
			for(int a = 1; a < skills.length; a++)
			{
				System.out.print(skills[a - 1] +", ");
				if(a % 6 == 0)
				{
					System.out.print("\r");
				}
			}
			System.out.print(skills[skills.length - 1] + "\r");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getReflex() + " Reflex");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getFortitude() + " Fortitude");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getWill() + " Will");
			System.out.println(rpgConstants.CHARACTER_CLASSES[i].getForce() + " Base Force Points\r");
		}
		/* Tests the dice roller, remove comments to use */ /*
		System.out.println("Testing Dice Roller");
		for(int i = 1; i < 101; i ++)
		{
			System.out.print(rpgDice.rollDice("2d2") + " ");
			if(i % 10 == 0)
			{
				System.out.print("\r");
			}
		} //*/
	}

}
