package strategyRPG;

/**
 * Instantiates all of the constants like HashMaps 
 * @author Grayson Hill
 *
 */
public class StartLoader 
{
	/**
	 * Constructor that loads all the constants
	 */
	public StartLoader()
	{
		loadFeats();
		loadTalents();
	}
	
	/**
	 * puts all the feats into the rpgConstants FEATS constant
	 */
	private void loadFeats()
	{
		rpgConstants.FEATS.put("Armor Proficiency(X)", "No Armor Check Penalty from X armor, Can benefit from X armor equipment bonuses");
		rpgConstants.FEATS.put("Weapon Proficiency(X)", "No -5 penalty to attack rolls when wielding X weapon");
		rpgConstants.FEATS.put("Skill Focus(X)", "+5 Competence Bonus with X trained skill");
		rpgConstants.FEATS.put("Skill Training(X)", "Trained in X skill");
	}
	
	/**
	 * puts all the talents into the rpgConstants TALENTS constant
	 */
	private void loadTalents()
	{
		rpgConstants.TALENTS.put("Adept Negotiator", "Standard Action, against target with INT 3+ that can see, hear, and understand you, \n"
				+ "make a Persuasion Check, if it beats the target's Will(they have +5 if they are higher level), the target takes -1 Condition, \n"
				+ "if it hits condition 0 it cannot attack you or your allies for the remainder of the encounter unless one of you attack it first, \n"
				+ "this is a min-affecting effect");
		rpgConstants.TALENTS.put("Force Persuasion", "You may use Use the Force instead of Persuasion when making Persuasion checks, \n"
				+ "You count as trained in Persuasion for using this talent, if you could re-roll Persuasion you may instead re-roll your substitution Use the Force check");
		rpgConstants.TALENTS.put("Master Negotiator", "You you successfully use Adept Negotiator, your target takes an additional -1 Condition");
		rpgConstants.TALENTS.put("Skilled Advisor", "Full-Round Action, you can give a +5 bonus to an ally's next skill check, you may spend a Force Point to give a +10, \n"
				+ "The target msut be able and willing to hear and understand your voice, you cannot use this on yourself, this is a mind-affecting effect");
		rpgConstants.TALENTS.put("Acrobatic Recovery", "When an effect knocks you prone, you may make a DC 20 Acrobatics check to stay standing");
		rpgConstants.TALENTS.put("Battle Meditation", "Full-Round Action, Spend a Force Point, you and all allies in 6 squares gain +1 Insight Bonus to attack rolls until the encounter ends, \n"
				+ "This bonus does not apply to allies outside the effect's range, even if the move within range later, Allies must stay within range to benefit, \n"
				+ "The bonus is lost if you fall unconscious or are killed, this is a mind-affecting effect");
		rpgConstants.TALENTS.put("Elusive Target", "When in melee, opponents have an additional -5 to hit you with ranged attacks");
		rpgConstants.TALENTS.put("Force Inuition", "You may use Use the Force instead of Initiative when making Initiative checks, \n"
				+ "You count as trained in Initiative for using this talent, if you could re-roll Initiative you may instead re-roll your substitution Use the Force check");
		rpgConstants.TALENTS.put("Resilience", "Swift Action, Spend a Force Point to gain +2 Condition");
		rpgConstants.TALENTS.put("Clear Mind", "You may re-roll opposed Use the Force checks to avoid being detected by other force users, you must keep the new result");
		rpgConstants.TALENTS.put("Dark Side Sense", "You may re-roll any Use the Force check to detect the presence or relative location of characters with a Dark Side Score of 1 or higher, \n"
				+ "you must keep the new result");
		rpgConstants.TALENTS.put("Dark Side Scourge", "When attacking characters with a Dark Side Score of 1 or higher, you deal extra damage equal to your Charisma modifier(min +1)");
		rpgConstants.TALENTS.put("Force Haze", "Standard Action, Spend a Force Point, select a number of creatures in line of sight equal to your Jedi level, make a Use the Force check, \n"
				+ "if the result beats an opponents Will Defense then the selected creatures have total concealment from that opponent, Force Haze lasts for 1 minute or until any hidden creature makes an attack");
		rpgConstants.TALENTS.put("Resist the Dark Side", "You gain a +5 Force Bonus to all defenses against [Dark Side] Force Powers and Force Powers from dark-side users(who's Dark Side Score equals their Wisdom)");
		rpgConstants.TALENTS.put("Block", "Reaction, You may negate a melee attack with a Use the Force check of DC equal to the attack roll you wish to negate, \n"
				+ "you take a cumulative -5 penalty for each time you have used Block or Deflect since the start of your last turn, \n"
				+ "You must have a drawn and ignited lightsaber, be aware of the attack, and not be flat-footed");
		rpgConstants.TALENTS.put("Deflect", "Reaction, You may negate a ranged attack with a Use the Force check of DC equal to the attack roll you wish to negate, \n"
				+ "you take a cumulative -5 penalty for each time you have used Block or Deflect since the start of your last turn, \n"
				+ "You must have a drawn and ignited lightsaber, be aware of the attack, and not be flat-footed, if you succeed you take half damage from autofire that hits, \n"
				+ "or no damage if the autofire misses, this cannot be used against other area attacks and cannot be used against creatures Colossal(Frigate) size and larger");
		rpgConstants.TALENTS.put("Lightsaber Defense(X)", "Swift Action, +X Deflection Bonus to Reflex Defense until the start of your next turn, \n"
				+ "you must have a lightsaber drawn and ignited, you must not be flat-footed or unaware of the attack, you may select this up to 3 times");
	}
}
