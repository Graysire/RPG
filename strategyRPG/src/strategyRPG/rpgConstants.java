package strategyRPG;

import java.util.HashMap;

/** contains all the constant values such as feats for the rpg */
public interface rpgConstants 
{
	/** contains all the available character classes */
	public static final CharacterClass[] CHARACTER_CLASSES = {new CharacterClass()};
	
	/** contains all the available feats and their descriptions */
	public static final HashMap<String,String> FEATS = new HashMap<String,String>();
	
	/** contains all the available talents and their descriptions */
	public static final HashMap<String,String> TALENTS = new HashMap<String,String>();
}
