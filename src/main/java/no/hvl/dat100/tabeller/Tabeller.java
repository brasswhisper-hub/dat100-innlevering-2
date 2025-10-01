package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
        
		if (tabell.length <= 0) {
			return "[]";
		}

		String streng ="[" + tabell[0];

        for (int i = 1; i < tabell.length; i++) {
            streng += "," + tabell[i];
        }

        return streng + "]";
	}

	// c)
	public static int summer(int[] tabell) {
        int sum=0;
        
		for (int i=0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for( int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall){
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for( int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall){
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] llebat = new int[tabell.length];
		int lastPos = tabell.length - 1;

		for( int i = 0; i < tabell.length; i++) {
			llebat[i] = tabell[lastPos - i];
		}

		return llebat;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i-1] > tabell[i]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int [] tabell = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			tabell[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			tabell[tabell1.length + i] = tabell2[i];
		}

		return tabell;
	}
}
