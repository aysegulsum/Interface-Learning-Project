
public abstract class Item {
	//Ay�e G�ls�m Eren 150120005
	//declare variables
	private double vat;
	private double basePrice;
	
	//setter and getter methods
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double price){
		this.basePrice = price;
	}
	//abstract method to calculate the final price of the item
	public abstract double calculatePrice();
	
}
