package strategyRPG;

/**
 * represents a class characters can take levels in
 * @author Grayson Hill
 *
 */
public class CharacterClass 
{
	/** The name of the character class */
	private String name;
	/** The level achieved in the class so far */
	private int level;
	/** The dice roll used to determine hit points gained whenever a new level si gained */
	private String hitDice;
	/** Number of trained skills selected at 1st level */
	private int numTrainedSkills;
	/** whether or not this class has the bonuses associated with Heroic classes */
	private boolean isHeroic;
	/** The progression for Base Attack Bonus this class has */
	private double baseAttackProgress;
	/** The list of class skills for this class */
	private String[] skills;
	
	/** bonus to Reflex Defense for having a level in this class */
	private int reflexBonus;
	/** bonus to Fortitude Defense for having a level in this class */
	private int fortitudeBonus;
	/** bonus to Will Defense for having a level in this class */
	private int willBonus;
	
	/**Default Constructor, describes the Nonheroic class */
	public CharacterClass()
	{
		name = "Nonheroic";
		hitDice = "1d4";
		numTrainedSkills = 1;
		isHeroic = false;
		baseAttackProgress = 0.75;
		skills = new String[]{"Acrobatics(DEX)","Athletics(STR)","Deception(CHA)","Endurance(CON)","Gather Information(CHA)", 
				"Initiative(DEX)","Knowledge(Bureaucracy)(INT)","Knowledge(Galactic Lore)(INT)","Knowledge(Life Sciences)",
				"Knowledge(Physical Sciences)(INT)","Knowledge(Social Sciences)(INT)","Knowledge(Tactics)(INT)",
				"Knowledge(Technology)(INT)","Mechanics(INT)","Perception(WIS)","Persuasion(CHA)","Pilot(DEX)","Stealth(DEX)",
				"Survival(WIS)","Treat Injury(WIS)","Use Computer(INT)"};
		reflexBonus = 0;
		fortitudeBonus = 0;
		willBonus = 0;
	}
	
	/**
	 * gets the name of the character class
	 * @return the name of the character class
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gets the hit dice of the character class
	 * @return the hit dice of the character class
	 */
	public String getHitDice()
	{
		return hitDice;
	}
	
	/**
	 * gets the number of trained skills the character class gets
	 * @return the number of traiend skills the character class gets
	 */
	public int getNumTrained()
	{
		return numTrainedSkills;
	}
	
	/**
	 * gets whether the character class is heroic or not
	 * @return whether the character class is heroic
	 */
	public boolean getHeroic()
	{
		return isHeroic;
	}
}
