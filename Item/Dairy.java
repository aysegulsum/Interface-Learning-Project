
public class Dairy extends Food{
	//Ayþe Gülsüm Eren 150120005
    //	IMPLEMENT CONSTRUCTORS
	public Dairy(){
	    this(8.0);
	}
	public Dairy(double basePrice){
		super.setBasePrice(basePrice);
	}
	//override method to calculate retail price
	@Override
	public double calculatePrice() {
		return (super.getBasePrice() * (1 + super.getVat())) * (1.3);	
	}
}
