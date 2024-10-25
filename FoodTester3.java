public class FoodTester3
{
	public static void main(String[] args)
	{
		Food3 food1 = new Food3 ("baked", "banana", "muffins", 12, 50); // output parameters
		food1.printForSale();
		Food3 food2 = new Food3 ("fried", "yam", "fritters", 3, 100);
		food2.printForSale();
		Pizza3 pizza = new Pizza3 ("pepperoni", 8, 250);
		pizza.printForSale();
	}
}
