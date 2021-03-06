package strategyRPG;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class that represents a single non-vehicle character
 * @author Grayson Hill
 *
 */
public class Character extends StatBlock
{
	
	/** A character's constitution and stamina */
	protected int constitution;
	/** A character's wisdom and perception */
	protected int wisdom;
	/** A character's charisma and persuasiveness */
	protected int charisma;
	
	/** The number of experience points the character possesses */
	protected int xp;
	/** A character's defense against psychological effects */
	protected int will;
	/** A character's 
	
	/** The species of the character */
	protected String species;
	
	/** The list of all languages the character understands/speaks */
	protected ArrayList<String> languages;
	/** The list of all character classes the character has */
	protected ArrayList<CharacterClass> characterClasses;
	/** The map of all the character's trained skills to skill bonuses */
	protected HashMap<String, Integer> skills;
	/** The map of the character's feats to feat descriptions */
	protected ArrayList<String> feats;
	/** The map of the character's talents to talent descriptions */
	protected ArrayList<String> talents;
	
	/** Default Constructor, creates a level 1 human nonheroic character */
	public Character()
	{
		name = "John Doe";
		strength = 10;
		dexterity = 10;
		constitution = 10;
		intelligence = 10;
		wisdom = 10;
		charisma = 10;
		xp = 0;
		reflex = 10;
		reflexFlatFooted = 10;
		fortitude = 10;
		species = "Human";
		size = Size.MEDIUM;
		characterClasses = new ArrayList<CharacterClass>();
		characterClasses.add(new CharacterClass());
		characterClasses.get(0).levelUp();
		skills.put(characterClasses.get(0).getSkills()[3], 10);
		feats = new ArrayList<String>();
		feats.add("Armor Proficiency(Light)");
		feats.add("Armor Proficiency(Medium)");
		feats.add("Skill Focus(Deception)");
		talents = new ArrayList<String>();
	}
}
