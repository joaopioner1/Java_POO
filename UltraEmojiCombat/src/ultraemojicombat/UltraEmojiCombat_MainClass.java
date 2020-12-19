package ultraemojicombat;

public class UltraEmojiCombat_MainClass {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
			
		l[0] = new Lutador("Pretty boy", "França", 31, 2, 4, 20, 1.75f, 68.9f);
		l[1] = new Lutador("SnapShoot", "Brazil", 56, 1, 6, 21, 1.80f, 69.9f);
		l[2] = new Lutador("Supimpa", "Alemanha", 39, 16, 8, 18, 1.76f, 65.8f);
		l[3] = new Lutador("Jack Sparrow", "Inglaterra", 46, 1, 4, 32, 1.82f, 88.5f);
		l[4] = new Lutador("Dragon killer", "Hungria", 33, 6, 7, 25, 1.64f, 69.2f);
		l[5] = new Lutador("Usurpador", "Holanda", 35, 3, 19, 21, 1.90f, 96.3f);

		Luta UFC = new Luta();
		UFC.marcarLuta(l[4], l[3]);
		UFC.lutar();
		l[2].status();
		l[1].status();
		
	}
}
