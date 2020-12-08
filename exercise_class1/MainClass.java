package exercise_class1;

public class MainClass {

	public static void main(String[] args) {
		//Author: João Vítor Souza Pioner | Date: 8/12/2020 17:36
	
		HeadPhone hp1 = new HeadPhone();
		
		hp1.color = "Blue";
		hp1.brand = "JBL";
		hp1.size = "Big";
		hp1.quantity = 3;
		hp1.soundQuality = "Good";
		hp1.connection = true;
		hp1.status();
		hp1.connection();
		
		HeadPhone hp2 = new HeadPhone();
		
		hp2.color = "Green";
		hp2.brand = "LG";
		hp2.size = "small";
		hp2.quantity = 7;
		hp2.soundQuality = "bad";
		hp2.connection = false;
		hp2.status();
		hp2.connection();
	}

}
