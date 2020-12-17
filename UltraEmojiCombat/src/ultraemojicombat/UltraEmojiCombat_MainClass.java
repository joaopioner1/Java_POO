package ultraemojicombat;

public class UltraEmojiCombat_MainClass {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
			
		l[0] = new Lutador("Pretty boy", "França", 31, 2, 4, 20, 1.75f, 68.9f);
		l[0].status();
		
		l[1] = new Lutador("SnapShoot", "Brasil", 56, 1, 6, 21, 1.80f, 68.9f);
		l[1].status();
		
		l[2] = new Lutador("InstaGhost", "Alemanha", 41, 2, 3, 23, 1.79f, 85.4f);
		l[2].status();
	}
}
