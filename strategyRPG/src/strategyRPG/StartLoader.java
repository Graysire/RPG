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
		
	}
}
