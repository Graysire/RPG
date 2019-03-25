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
				+ "You count as trained in Persuasion for using this talent, if you could re-roll Persuasion you may instead Re-roll your substitution Use the Force check");
		rpgConstants.TALENTS.put("Master Negotiator", "You you successfully use Adept Negotiator, your target takes an additional -1 Condition");
		rpgConstants.TALENTS.put("Skilled Advisor", "Full-Round Action, you can give a +5 bonus to an ally's next skill check, you may spend a Force Point to give a +10, \n"
				+ "The target msut be able and willing to hear and understand your voice, you cannot use this on yourself, this is a mind-affecting effect");
	}
}
