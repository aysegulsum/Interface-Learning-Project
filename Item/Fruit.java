
public class Fruit extends Food implements Vegan, Washable {
	//Ayþe Gülsüm Eren 150120005
	//implement constructors
	public Fruit() {
		this(6.0);
	}
	public Fruit(double basePrice) {
		super.setBasePrice(basePrice);
	}
	//override method to show special message
	@Override
	public void madeOf() {
		System.out.println("It is made only of fruits.");	
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() *(1 + super.getVat())) * (1.2);
	}
	//override method to show special message
	@Override
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
	}
}
