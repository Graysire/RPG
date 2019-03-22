package strategyRPG;

/**
 * Represents a location on a grid
 * @author Grayson Hill
 *
 */
public class Location 
{
	/**
	 * position in the left-right direction on a top-down grid
	 */
	private int xLocation;
	/**
	 * position in the up-down direction on a top-down grid
	 */
	private int yLocation;
	/**
	 * position in the into-out of direction on a top-down grid
	 */
	private int zLocation;
	
	/**
	 * Default constructor, the location at ground level at the origin of a grid
	 */
	Location()
	{
		xLocation = 0;
		yLocation = 0;
		zLocation = 0;
	}
	
	/**
	 * Constructor with custom xyz location
	 * @param x x component of the location
	 * @param y y component of the location
	 * @param z z component of the location
	 */
	Location(int x, int y, int z)
	{
		xLocation = x;
		yLocation = y;
		zLocation = z;
	}
	
	/**
	 * calculates the distance between this location and another one
	 * @param loc the target location
	 * @return the distance between the two locations
	 */
	public int calcDistance(Location loc)
	{
		
		// square root( squared(targetX-thisX) + squared(targetY-thisY) + squared(targetZ-thisZ) )
		return (int) Math.sqrt(Math.pow((loc.xLocation - this.xLocation),2) + Math.pow(loc.yLocation - this.yLocation, 2) + Math.pow(loc.zLocation - this.zLocation, 2));
	}
	
	/**
	 * returns the location as a String
	 */
	public String toString()
	{
		return "(" + xLocation + ", " + yLocation + ", " + zLocation + ")";
	}
}
