package game;

public class Terninger {

	// VARIABLER
	private static int a = 0;
	private static int b = 0;
	private static final int MAX = 6;

	// KONSTRUKTOER
	public Terninger() {	
	}

	// METODER
	public static void kastTerninger() {
		a = (int) (Math.random()*MAX)+1;
		b = (int) (Math.random()*MAX)+1;
	}
	
	// getter-metoder
	public static int geta() {
		return a;
	}
	
	public static int getb() {
		return b;
	}
	
	public static int getSum() {
		return a + b;
	}

	public static boolean getEns() {
		if (a==b) return true;
		else return false;
	}

	public static String getVaerdiNavn() {
		if (getEns()) {
			switch (a) {
			case 1: return "par 1";
			case 2: return "par 2";
			case 3: return "par 3";
			case 4: return "par 4";
			case 5: return "par 5";
			case 6: return "par 6";
			default: ;
			}
		}
		return String.valueOf(a+b);
	}

	public static boolean getParEt() {
		if (a == 1 && b == 1) return true;
		else return false;
	}

	public static boolean getParSeks() {
		if (a == 6 && b == 6) return true;
		else return false;
	}
	
	// setter-metoder
	public static void seta(int n) {
		a = n;
	}
	
	public static void setb(int n) {
		b = n;
	}
}