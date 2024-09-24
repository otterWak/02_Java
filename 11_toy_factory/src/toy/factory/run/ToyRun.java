package toy.factory.run;

import toy.factory.model.service.ToyFactoryClass;

public class ToyRun {

	public static void main(String[] args) {
		ToyFactoryClass service = new ToyFactoryClass();
		
		service.toyFactory();
		service.displayMenu();
	}

}
