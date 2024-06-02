
public class Underware extends Clothing{
	//Ayþe Gülsüm Eren 150120005
	//implement constructors
	public Underware() {
		this(30.0);
	}
	public Underware(double basePrice) {
		super.setBasePrice(basePrice);
	}
	//override method to show special message
	@Override
	public void howToWash() {
	    System.out.println("Wash Underware at 60 degrees.");
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() *(1 + super.getVat())) * (1.45);
	}
}
