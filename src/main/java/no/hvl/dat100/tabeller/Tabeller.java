package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int i=0; i<tabell.length; i++) {
            System.out.print(tabell[i]);
        }


	}

	// b)
	public static String tilStreng(int[] tabell) {
        String ferdig ="";
        for (int i=0; i<tabell.length; i++) {
            ferdig=""+tabell[i];
            System.out.print(ferdig);
        }
        return ferdig;
	}

	// c)
	public static int summer(int[] tabell) {
        int sum=0;
        for (int i=0; i<tabell.length;i++) {
            sum= i+=i;
        }
        System.out.print(sum);
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        boolean funnet =false;
        int i=0;
        while (!funnet && i<tabell.length) {
            for (int rad=0; rad<tabell.length; rad++) {
                if (tabell[rad]==tall) {
                    funnet=true;
                } else {
                    i++
                }
            }
        }
        return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
