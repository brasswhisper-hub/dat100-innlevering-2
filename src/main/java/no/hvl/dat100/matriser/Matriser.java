package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";

		for ( int[] i : matrise) {
			
			for ( int j : i) {
				streng += j + " ";
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
		int[][] matrix = new int[matrise.length][matrise[0].length];

		for ( int i = 0; i < matrise.length; i++) {
			for ( int j = 0; j < matrise[i].length; j++) {
				matrix[j][i] = matrise[i][j];
			}
		}

		return matrix;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		
		int[][] c = new int[b.length][a[0].length];

		for ( int m = 0; m < c.length; m++) {
			for ( int p = 0; p < c[m].length; p++) {
				c[m][p] = 0;
			}
		}

		if (a[0].length != b.length) {
			return c;
		}
		
		for ( int m = 0; m < c.length; m++) {
			for ( int p = 0; p < c[m].length; p++) {
				for ( int n = 0; n < b.length; n++) {
					c[m][p] += a[m][n] * b[n][p];
				}
			}
		}

		/* All cap. Dette gjor at eg endelig forsto matrisemultiplikasjon
		// uten å måtte sette det opp i en formel. Det e jo bare:
		//		
		// m x n ===> a[m][n]
		// n x p ===> b[n][p]
		// m x p ===> c[m][p] = a[m][n] * b[n][p];
		// 
		*/ 

		return c;
	}
}
