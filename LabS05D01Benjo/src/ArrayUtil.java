public class ArrayUtil {
	/**
	 * Funkcija koja ispisuje uneseni niz
	 * 
	 * @param array
	 *            niz koji cemo ispisati
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * Funkcija prima parametar size(velicinu niza), i od korisnika trazi da u
	 * niz unese toliko brojeva.
	 * 
	 * @param size
	 *            velicina niza
	 * @return popunjen niz.
	 */
	public static int[] getUserArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Unesite " + (i + 1) + " clan niza");
			array[i] = TextIO.getInt();
		}

		return array;
	}

	/**
	 * Funkcija prima velicinu niza, i vrijednost kojom ce ispuniti niz. Ako je
	 * unesena vrijednost -1, funkcija ce popuniti niz sa -1.
	 * 
	 * @param size
	 *            velicina niza
	 * @param defaultVal
	 *            vrijednost kojom zelimo popuniti niz
	 * @return popunjen niz
	 */
	public static int[] getArray(int size, int defaultVal) {
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = defaultVal;
		}
		return array;
	}

	/**
	 * Funkcija kopira drugi niz u prvi niz.(vrijednosti prvog niza copiramo u
	 * drugi niz.)
	 * 
	 * @param niz1
	 *            = niz koji kopiramo
	 * @param niz2
	 *            =  niz preko kojeg cemo kopirati.
	 * @return = kopirani niz1.
	 */
	public static int[] copyArray(int[] niz1, int[] niz2) {
		
		// Kada su nizovi jednaki
		if (niz1.length <= niz2.length) {
			copyNiz(niz1, niz2);
		}

		// Kada je prvi niz veci od drugog.
		if (niz1.length > niz2.length) {
			niz2 = new int [niz1.length];
			copyNiz(niz1, niz2);
		}

		
     return niz2;
	}

	
	
	private static void copyNiz(int[] niz1, int[] niz2) {


		for (int i = 0; i < niz1.length; i++) {
			niz2[i] = niz1[i];
		}
		
	}
	
	public static int[] pomjeriUDesno (int [] niz){
		int [] nizPomjerenUDesno = new int [niz.length];
		for(int i=1; i<nizPomjerenUDesno.length;i++){
			nizPomjerenUDesno[0]=0;
			nizPomjerenUDesno[i]=niz[i-1];
		}
		return nizPomjerenUDesno;
	}

	
	public static int[] pomjeriULijevo (int [] niz){
		int [] nizPomjerenULijevo = new int [niz.length];
		for(int i=0; i<nizPomjerenULijevo.length-1;i++){
			nizPomjerenULijevo[i]=niz[i+1];
		}
		return nizPomjerenULijevo;
	}
}
