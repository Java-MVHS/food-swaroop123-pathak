
/* 
 * Swaroop Pathak
 * 10-25-24
  Pizza.java
*/

public class Pizza3 extends Food3
{
	
	public Pizza3()
	{
		super();// calls the super class
		}
		public Pizza3(String IngredientsIn, int quantityIn, int costIn)
		{
			super("bake", IngredientsIn, "Pizza", quantityIn, costIn);// sends in the five "childeren"
			}
	public Pizza3(String IngredientIn, String nameIn,  int quantityIn, int costIn)
	{
		super("baked", IngredientIn, nameIn, quantityIn,  costIn);
		}
	}
