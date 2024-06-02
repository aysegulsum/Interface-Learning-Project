import java.util.ArrayList;

public class ShoppingMall {
	//Ayþe Gülsüm Eren 150120005

	//create variable
	private static ArrayList<Item> items = new ArrayList<Item>();
	//getter method for arraylist
	public ArrayList<Item> getItems() {
		return items;
	}
	//other methods to add items in arraylist
	public void addDairy() {
	    Dairy dairy = new Dairy();
		items.add(dairy);
	}
	public void addFruit() {
		Fruit fruit = new Fruit();
		items.add(fruit);
	}
	public void addTop() {
		Top top = new Top();
		items.add(top);
		}
	public void addTrousers() {
		Trousers trousers = new Trousers();
		items.add(trousers);
	}
	public void adddUnderware() {
		Underware underware = new Underware();
		items.add(underware);
	}
	public void addVegetable() {
		Vegetable vegetable = new Vegetable();
		items.add(vegetable);
	}
	public void addArbitrary(Item item) {
		items.add(item);
	}
	//this method  calculates the total price of items in the ArrayList 
	public double bill() {
	    double	totalPrice=0;
		for(int i=0; i< items.size();i++) {
			totalPrice += items.get(i).calculatePrice();
		}
		return totalPrice;
	}
}
