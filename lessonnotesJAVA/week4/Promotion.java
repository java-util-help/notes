public class Promotion {

	public static void main(String[] args) {
		double result = max(5,6);

		System.out.println("max is "+result);

		/* y1 = 9.5 diyemeyiz, çünkü static içinde olmaz
			y3 = 9.5 diyebiliriz. */
	}	

	// static method'dan instance variable'e nesne oluşturmadan erişilemez

	public static double max(double y1, double y2) {
		// static nesne oluşturmadan direkt kullanmak için
		if(y1<y2)
			return y2;
		else	//aslında burada else'e gerek yok çünkü
				//if'teki return'a girerse method'dan çıkmış olur
			return y1;
	}
}