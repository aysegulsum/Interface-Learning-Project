
public class Trousers extends Clothing {
	//Ayþe Gülsüm Eren 150120005
	//implement constructors
	public Trousers(){
		this(40.0);
	}
	public Trousers(double basePrice) {
		super.setBasePrice(basePrice);
	}
	//override method to show special message
	@Override
	public void howToWash() {
		System.out.println("Wash Trousers at 30 degrees.");
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() *(1 + super.getVat())) * (1.2);
	}
	
}
