
public class Top extends Clothing{
	//Ayþe Gülsüm Eren 150120005
	//implement constructors
	public Top(){
		this(20.0);
	}
	public Top(double basePrice) {
		super.setBasePrice(basePrice);
	}
	//override method to show special message
	@Override
	public void howToWash() {
		System.out.println("Wash Top at 40 degrees.");
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() *(1 + super.getVat())) * (1.2);
	}

}
