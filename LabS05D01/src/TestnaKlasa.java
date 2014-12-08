public class TestnaKlasa {
	public static void main(String[] args) {

		int temp;

		int niz[] = { 2, 5, 4, 5, 6, 7, 1, 4, 6 };

		niz = ArrayUtil.sortiranjeNiza(niz, true);
		ArrayUtil.printArray(niz);
		
		System.out.println();
		
		niz = ArrayUtil.sortiranjeNiza(niz, false);
		ArrayUtil.printArray(niz);
		
	}
}
