
public class DatoveTypy {

	public static void main(String[] args) {
	
		//datove typy
		//---------------
		
		//celociselne
		
		int vek; //deklaracia premennej
		
		vek = 29; //inicializacia premennej
		
		int vyska, hmotnost; //mozeme deklarovat viacere premenne naraz. musime ich oddelit ciarkou
		
		int rocnik = 4;
		
		vyska = 0xaa; //zapis cisla v hex sustave
		
		hmotnost = 0b101111; //zapis cisla v bin sustave
		
		short kratka = 1;
		////////////////////////////////////////////
		//desatinne cisla
		
		double cena = 25.5;
		float vydavok = 0.56f;
		
		//logicky datovy typ
		boolean zenaty = false;
		
		//typ char
		
		char mena = '€';
		
		System.out.println("Mena: " + mena);
		
		System.out.println("Je zenaty? " + zenaty);
		
		System.out.println("Vydavok: " + vydavok);
		System.out.println("Cena: " + cena);

		System.out.println("----------------- ");

		System.out.println("Vyska: " + vyska);
		System.out.println("Hmotnost: " + hmotnost);
		
		System.out.println("Integer min value: " + Integer.MIN_VALUE);
		System.out.println("Integer max value: " + Integer.MAX_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		
		kratka = 5000;
		
		System.out.println("Kratka: " + kratka);

		System.out.println("Vek: " + vek);
		
		
	}

}
