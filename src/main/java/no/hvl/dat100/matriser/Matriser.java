package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.println(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		
		for ( int i = 0; i < matrise.length; i++) {
			for ( int j = 0; j < matrise[i].length; j++) {
				streng += matrise[i][j] + " ";
			}
			streng += "\n";
		}

		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		//anntar at alle rekkene i matrisen er av samme lengde...
		int iMax = matrise.length;
		int jMax = matrise[0].length;

		int[][] m = new int[iMax][jMax];

		for ( int i = 0; i < iMax; i++) {
			for ( int j = 0; j < jMax; j++) {
				m[i][j] = tall * matrise[i][j];
			}
		}

		return m;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length != b.length) {
			return false;
		}

		if (a[0].length != b[0].length) {
			return false;
		}


		for ( int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[0].length; j++) {
				if ( a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
