public class StringInt {

	public static void main(String[] args) {
		String str = "Nesneye yönelik Programlama ";
		int x = 5;
		int y = 9;

		str = str + true; /* soldan sağa doğru şeklinde baktığı için
						int'leri sanki string'miş gibi alır */


		/* 
		str = str + (x + y);  ===== 14
		str = str + x + y;	  ===== 59
		*/

		System.out.println(str);

	}
}