
public class Kitap {

	public String isim;
	private int sayfaSayisi;


	public Kitap(String isim, int sayfaSayisi) {
		this.isim = isim;
		this.sayfaSayisi = sayfaSayisi;
	}

	// methods
	public int sayfaSayisi(Kitap[] kitaplar) {
		int sayfalar = 0;
		for(Kitap kObj : kitaplar) {
			sayfalar += kObj.sayfaSayisi;
		}

		return sayfalar;
	}

	// setters
	public void setIsim(String isim){
		this.isim = isim;
	}
	public void setSayfaSayisi(int sayfaSayisi){
		this.sayfaSayisi = sayfaSayisi;
	}

	// getters
	public String getIsım() {
		return this.isim;
	}
	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}
}