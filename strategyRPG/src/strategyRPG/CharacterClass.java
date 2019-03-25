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
	private int level = 0;
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
	
	/** base number of force points gained every level */
	private int forcePoints;
	
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
		forcePoints = 0;
	}
	
	/**
	 * Constructor for a fully customized character class
	 * @param name the name of the character class
	 * @param hitDice the size of the character class' hit dice
	 * @param numSkills the base number of trained skills the character class gets
	 * @param heroic whether the character class is heroic
	 * @param attackBonus the attack bonus progression of the character class
	 * @param skills the class skill list for the character class
	 * @param refBonus the character class' bonus to reflex defense
	 * @param fortBonus the character class' bonus to fortitude defense
	 * @param willBonus the character class' bonus to will defense
	 * @param force the character class' base force points
	 */
	public CharacterClass(String name, String hitDice, int numSkills, boolean heroic, double attackBonus, String[] skills, int refBonus, int fortBonus, int willBonus, int force)
	{
		this.name = name;
		this.hitDice = hitDice;
		numTrainedSkills = numSkills;
		isHeroic = heroic;
		baseAttackProgress = attackBonus;
		this.skills = skills;
		reflexBonus = refBonus;
		fortitudeBonus = fortBonus;
		this.willBonus = willBonus;
		forcePoints = force;
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
	
	/**
	 * gets the character class' BAB progression
	 * @return the character class' BAB progression
	 */
	public double getBAB()
	{
		return baseAttackProgress;
	}
	
	/**
	 * gets the array of character class skills
	 * @return the array of character class skills
	 */
	public String[] getSkills()
	{
		return skills;
	}
	
	/**
	 * gets the character class bonus to Reflex Defense
	 * @return the bonus to Reflex Defense
	 */
	public int getReflex()
	{
		return reflexBonus;
	}
	
	/**
	 * gets the character class bonus to Fortitude Defense
	 * @return the bonus to Fortitude Defense
	 */
	public int getFortitude()
	{
		return fortitudeBonus;
	}
	
	/**
	 * gets the character class bonus to Will Defense
	 * @return the bonus to Will Defense
	 */
	public int getWill()
	{
		return willBonus;
	}
	
	/**
	 * gets the character class' base force points
	 * @return the base force points
	 */
	public int getForce()
	{
		return forcePoints;
	}
	
	/**
	 * gets the character class level
	 * @return the character class level
	 */
	public int getLevel()
	{
		return level;
	}
	
	/**
	 * levels the character class once
	 */
	public void levelUp()
	{
		level++;
	}
}
