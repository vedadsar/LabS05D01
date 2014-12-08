public class TestnaKlasa {
	public static void main(String[] args) {

		// int [] niz = ArrayUtil.getUserArray(5);
		// int [] niz = ArrayUtil.getArray(5, -1);

		int[] niz1 = { 1, 2, 3, 4, 5 };
		//int[] niz2 = new int [1];

		//niz2 = ArrayUtil.copyArray(niz1, niz2);
		
		
		niz1 = ArrayUtil.pomjeriUDesno(niz1);
		ArrayUtil.printArray(niz1);

	}
}
