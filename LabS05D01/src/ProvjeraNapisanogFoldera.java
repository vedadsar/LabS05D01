import testniFolder.TestnaKlasa;

public class ProvjeraNapisanogFoldera {
	
	public static void  prvaRekurzija(int broj){
		if(broj == 1)
		{
			System.out.println("Broj je jedan");
			}else{
				prvaRekurzija(broj-1);
				System.out.println("Broj je " +broj);
			}
		
		}
	
	public static void main(String[] args) {
		prvaRekurzija(4);

	}
}
