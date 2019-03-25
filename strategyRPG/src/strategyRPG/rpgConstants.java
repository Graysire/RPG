package strategyRPG;

import java.util.HashMap;

/** contains all the constant values such as feats for the rpg */
public interface rpgConstants 
{
	/** contains all the available character classes */
	public static final CharacterClass[] CHARACTER_CLASSES = {new CharacterClass(), 
			new CharacterClass("Jedi", "1d10", 2, true, 1.0, new String[]{"Acrobatics(DEX)","Endurance(CON)","Initiative(DEX)",
					"Knowledge(Bureaucracy)(INT)","Knowledge(Galactic Lore)(INT)","Knowledge(Life Sciences)","Knowledge(Physical Sciences)(INT)",
					"Knowledge(Social Sciences)(INT)","Knowledge(Tactics)(INT)","Knowledge(Technology)(INT)","Perception(WIS)","Pilot(DEX)",
					"Use the Force(CHA)"}, 1, 1, 1, 5),
			new CharacterClass("Noble", "1d6", 6, true, 0.75, new String[]{"Deception(CHA)","Gather Information(CHA)","Initiative(DEX)",
					"Knowledge(Bureaucracy)(INT)","Knowledge(Galactic Lore)(INT)","Knowledge(Life Sciences)","Knowledge(Physical Sciences)(INT)",
					"Knowledge(Social Sciences)(INT)","Knowledge(Tactics)(INT)","Knowledge(Technology)(INT)","Perception(WIS)","Persuasion(CHA)",
					"Pilot(DEX)","Ride(DEX)","Treat Injury(WIS)","Use Computer(INT)"},1,0,2,5),
			new CharacterClass("Scoundrel", "1d6", 4, true, 0.75, new String[]{"Acrobatics(DEX)","Deception(CHA)","Gather Information(CHA)","Initiative(DEX)",
					"Knowledge(Bureaucracy)(INT)","Knowledge(Galactic Lore)(INT)","Knowledge(Life Sciences)","Knowledge(Physical Sciences)(INT)",
					"Knowledge(Social Sciences)(INT)","Knowledge(Tactics)(INT)","Knowledge(Technology)(INT)","Mechanics(INT)","Perception(WIS)","Persuasion(CHA)",
					"Pilot(DEX)","Stealth(DEX)","Use Computer(INT)"},2,0,1,5),
			new CharacterClass("Scout", "1d8", 5, true, 0.75, new String[]{"Athletics(STR)","Endurance(CON)","Initiative(DEX)",
					"Knowledge(Bureaucracy)(INT)","Knowledge(Galactic Lore)(INT)","Knowledge(Life Sciences)","Knowledge(Physical Sciences)(INT)",
					"Knowledge(Social Sciences)(INT)","Knowledge(Tactics)(INT)","Knowledge(Technology)(INT)","Mechanics(INT)","Perception(WIS)","Pilot(DEX)",
					"Ride(DEX)","Stealth(DEX)","Survival(WIS)"},2,1,0,5),
			new CharacterClass("Soldier", "1d10", 3, true, 1.0, new String[]{"Athletics(STR)","Endurnace(CON)","Initiative(DEX)",
					"Knowledge(Tactics)(INT)","Mechanics(INT)","Perception(WIS)", "Pilot(DEX)","Treat Injury(WIS)","Use Computer(INT)"},1,2,0,5),
			new CharacterClass("Beast", "1d8", 1, false, 0.75, new String[] {"Acrobatics(DEX)","Athletics(STR)","Endurance(CON)","Initiative(DEX)",
					"Perception(WIS)","Stealth(DEX)","Survival(WIS)"},0,0,0,0)};
	
			
	/** contains all the available feats and their descriptions */
	public static final HashMap<String,String> FEATS = new HashMap<String,String>();
	
	/** contains all the available talents and their descriptions */
	public static final HashMap<String,String> TALENTS = new HashMap<String,String>();
}
