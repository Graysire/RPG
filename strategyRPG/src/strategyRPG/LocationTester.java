package strategyRPG;
/**
 * tests the functionality of the Location class
 * @author Grayson Hill
 *
 */
public class LocationTester 
{

	public static void main(String[] args) 
	{
		System.out.println("Creating Default Location: Expected toString: (0, 0, 0)");
		Location test1 = new Location();
		System.out.println(test1);
		System.out.println("Creating Location: Expect toString: (2,4,4)");
		Location test2 = new Location(2,4,4);
		System.out.println(test2);
		System.out.println("Testing Distance from 1 to 2, Expected Value: 6");
		System.out.println(test1.calcDistance(test2));
		System.out.println("Testing Distance from 2 to 1, Expected Value: 6");
		System.out.println(test2.calcDistance(test1));
	}

}
