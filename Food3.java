/* 
 * Swaroop Pathak
 * 10-25-24
  Food.java
*/


public class Food3 // parent class
{
	protected String str; // this is the string that prints the entire output
	
	public Food3 ()
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int quantity, int cost)// five parameters
	{	
		
		str = String.format("At the sale: %s will be sold for %s cents each. With %d %s $%d will be made.", name, prepMethod, quantity, ingredient, (quantity * cost/100) ); // whole output
	}

	public void printForSale()
	{
		System.out.println(str); // prints out str.
	}
}

