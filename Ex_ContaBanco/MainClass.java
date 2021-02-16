package Ex_ContaBanco;

public class MainClass {

	public static void main(String[] args) {
		
		Conta c = new Conta("João Vítor", "Bradesco", 521, 2568.55);
		Conta c1 = new Conta("João Vítor", "Bradesco", 521, 2568.55);
		Conta c2 = new Conta("João Vítor", "Bradesco", 521, 2568.55);
		Conta c3 = new Conta("João Vítor", "Bradesco", 521, 2568.55);
		int tot = Conta.getTotConta();
		System.out.println(tot);
	}
}
