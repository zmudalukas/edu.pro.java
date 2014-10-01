
public class Operatory {

	public static void main(String[] args) {
		
		//priradenie
		
		int suma;
		suma = 1500;
		
		System.out.println("Suma: " + suma);
		
		//aritmeticke operatory
		
		//binarne
		int a = 12;
		int b = 10;
		
		suma = a + b;//scitanie
		suma = a - b;//odcitanie
		suma = a * b;//nasobenie
		suma = a / b;//delenie (celociselne)
		
		suma = a % b;//zvysok po deleni
		
		//unarne
		//suma = a++;
		//suma = ++a;
		
		//suma = a--;
		//suma = --a;
		
		//
		
		 //a += b; // => a = a + b;
		//a -= b;
//		a *= b;
//		a /= b;
//		a %= b;
		
		//relacne
		System.out.println("Relacne op.:");
		System.out.println(a <= b);
		System.out.println(a >= b);
		
		boolean zenaty = false;
		System.out.println(zenaty);
		System.out.println(!zenaty);
		
		System.out.println(a == b);
		System.out.println((a < b) && (b > 0));//operator AND
		System.out.println((a < b) || (b > 0));//operator OR
		System.out.println(a != b); //operator NOT
		
		
		
		
		//System.out.println("Suma: " + suma);
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
