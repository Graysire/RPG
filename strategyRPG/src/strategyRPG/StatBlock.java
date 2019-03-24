package strategyRPG;

import java.util.ArrayList;

/**
 * Represents the basics that all character/vehicle statistics have
 * @author Graysire
 *
 */
public abstract class StatBlock 
{
	/** The name of the character */
	protected String name;
	/** A character's strength and physical power */
	protected int strength;
	/** A character's dexterity and agility */
	protected int dexterity;
	/** A character's intelligence and reasoning */
	protected int intelligence;
	
	/** A character's defense against normal ranged and melee attacks */
	protected int reflex;
	/** A character's defense against surprise attacks */
	protected int reflexFlatFooted;
	/** A character's defense based on their toughness and strength */
	protected int fortitude;
	
	/** The damage a character can withstand before falling */
	protected int hitPoints;
	
	/** The damage in excess of the damage threshold gives a character penalties */
	protected int damageThreshold;
	
	/** the character's position on the condition track */
	protected int condition;
	
	/** The number of squares a character can move */
	protected int speed;
	
	/** The list of all special traits a character has */
	protected ArrayList<String> traits;
	
}
