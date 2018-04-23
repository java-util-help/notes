public class Maximum {
	public double y1; // non-static filed or instance variable
	public double y2; 

	public Maximum(double y1, double y2) {
		this.y1 = y1;
		this.y2 = y2;
		// constructure ile hiç arguman almayan maximum'u 
		// alabilmesi için ayarladık
	}

	public static void main(String[] args) {
		double d1 = 5.67;
		double d2 = 8.9;
		Maximum object1 = new Maximum(d1, d2);
		Maximum object2 = new Maximum(6.7, 7.8);

		double max1 = object1.max();
		double max2 = object2.max();
		
		System.out.println("max of object1 is"+max1);
		System.out.println("max of object2 is"+max2);

		/* y1 = 9.5 diyemeyiz, çünkü static içinde olmaz
			y3 = 9.5 diyebiliriz. */

		y3 = 9.5;
	}	

	// static method'dan instance variable'e nesne oluşturmadan erişilemez

	public /* static */ double max() {
		// static nesne oluşturmadan direkt kullanmak için
		if(y1<y2)
			return y2;
		else	//aslında burada else'e gerek yok çünkü
				//if'teki return'a girerse method'dan çıkmış olur
			return max;
	}
}