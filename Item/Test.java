
public class Test {
	//Ayþe Gülsüm Eren 150120005

	public static void main(String[] args) {
		// create object
		ShoppingMall sp = new ShoppingMall();
		//add items to object
		sp.addDairy();
		sp.addFruit();
		sp.addTop();
		sp.addTrousers();
		sp.adddUnderware();
		sp.addVegetable();
		
		Top top = new Top(100);
 		sp.addArbitrary(top);

 		//call methods to print message
 		printContent(sp);
 		printWashingInstructions(sp);
 		//print the bill
 		System.out.println((int)(sp.bill() * 1000)/ 1000.0);

    }
	//create method to invoke madeOf methods of all vegans
	public static void printContent(ShoppingMall sp) {
		
			for(int i=0; i< sp.getItems().size(); i++) {
				if (sp.getItems().get(i) instanceof Fruit) {
					((Fruit)sp.getItems().get(i)).madeOf();
				}
				else if (sp.getItems().get(i) instanceof Vegetable) {
					((Vegetable)sp.getItems().get(i)).madeOf();
				}
			}
 		
	}
	//create method to invoke howToWash methods of all washables
	public static void printWashingInstructions(ShoppingMall sp) {
		
		for(int i=0; i< sp.getItems().size(); i++) {
			if (sp.getItems().get(i) instanceof Fruit) {
				((Fruit)sp.getItems().get(i)).howToWash();
			}
			else if (sp.getItems().get(i) instanceof Vegetable) {
				((Vegetable)sp.getItems().get(i)).howToWash();
			}
			else if (sp.getItems().get(i) instanceof Clothing) {
				((Clothing)sp.getItems().get(i)).howToWash();
			}
	   }

	}
}
