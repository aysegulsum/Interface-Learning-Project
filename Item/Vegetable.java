
public class Vegetable extends Food implements Washable , Vegan{
	//Ayþe Gülsüm Eren 150120005
	//implement constructors
	public Vegetable(){
		this(10.0);
	}
	public Vegetable(double basePrice) {
		super.setBasePrice(basePrice);
	}
	//override method to show special message
	@Override
	public void madeOf() {
		System.out.println("It is made only of vegetables.");
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() * (1 + super.getVat())) * (1.25);
	}
	//override method to show special message
	@Override
	public void howToWash() {
		System.out.println("Wash Vegetable with warm water.");
	}
}
