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
		
	}
	
}
