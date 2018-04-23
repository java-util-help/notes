public class CeaserCipher {
	
	public static void main(String[] args) {
		CeaserCipher nesne=new CeaserCipher();
		nesne.test();
	}

	public void test() {
		String message = "NESNEYE YONELIK PROGRAMLAMA";
		int key = 4;
		String encrypted = encrypt(message, key);
		System.out.println("Message "+message);
		System.out.println("encrypted Message "+encrypted);
	}

	public String encrypt(String message, int key){
		String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String encrAlph = alph.substring(key)+alph.substring(0,key);
		StringBuilder encryptedMessage = new StringBuilder(message);

		for (int i=0; i<message.length(); i++) {
			char letter = message.charAt(i); // message'in i. harfini verir
			int idx = alph.indexOf(letter); // alfabede kaçıncı sıraya denk geldiğine bakar
				//bulamadığı karakterler için -1 yollar bunu if ile önleriz
			if(idx >= 0){
				char newLetter = encrAlph.charAt(idx);
				encryptedMessage.setCharAt(i, newLetter);
			}
		}
	return encryptedMessage.toString();
	}
}