package strategyRPG;

/**
 * represents the size of a character and determines the size bonuses/penalties
 * @author Grayson Hill
 *
 */
public enum Size 
{
	/**
	 * the sizes from smallest to largest
	 */
	FINE,DIMINUTIVE,TINY,SMALL,MEDIUM,LARGE,HUGE,GARGANTUAN,COLOSSAL,COLOSSAL_FRIGATE,COLOSSAL_CRUISER,COLOSSAL_STATION;
	
	/**
	 * gets the reflex bonus/penalty a given size grants
	 * @return the reflex bonus/penalty from size
	 */
	public int getReflexBonus()
	{
		switch(this)
		{
		case FINE:
			return 10;
		case DIMINUTIVE:
			return 5;
		case TINY:
			return 2;
		case SMALL:
			return 1;
		case MEDIUM:
			return 0;
		case LARGE:
			return -1;
		case HUGE:
			return -2;
		case GARGANTUAN:
			return -5;
		default:
			return -10;
		}
		
	}
	/**
	 * gets the stealth bonus/penalty a given size grants
	 * @return the stealth bonus/penalty from size
	 */
	public int getStealthBonus()
	{
		switch(this)
		{
		case FINE:
			return 20;
		case DIMINUTIVE:
			return 15;
		case TINY:
			return 10;
		case SMALL:
			return 5;
		case MEDIUM:
			return 0;
		case LARGE:
			return -5;
		case HUGE:
			return -10;
		case GARGANTUAN:
			return -15;
		default:
			return -20;
		}
	}
	
	public int getThresholdBonus()
	{
		switch(this)
		{
		case LARGE:
			return 5;
		case HUGE:
			return 10;
		case GARGANTUAN:
			return 20;
		case COLOSSAL:
			return 50;
		case COLOSSAL_FRIGATE:
			return 100;
		case COLOSSAL_CRUISER:
			return 200;
		case COLOSSAL_STATION:
			return 500;
		default:
			return 0;
		}
	}
}
