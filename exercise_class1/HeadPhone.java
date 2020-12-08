package exercise_class1;

public class HeadPhone {
	//Author: João Vítor Souza Pioner | Date: 8/12/2020 17:36

	String color;
	String brand;
	String size;
	String soundQuality;
	int quantity;
	boolean connection;
	
	void status() {

		System.out.println("HEADPHONE CHARACTERISTICS:");
		System.out.println("\nColor: " + this.color);
		System.out.println("Brand: " + this.brand);
		System.out.println("Size: " + this.size);
		System.out.println("Sound: " + this.soundQuality);
		System.out.println("Sound: " + this.quantity);

	}
	
	void connection() {
		
		if (connection == true) {
			System.out.println("The headphone is connected");
			System.out.println("-------------------------");
		}
		else {
			System.out.println("The headphone is not connected");
			System.out.println("-------------------------");
		}
	}
}
