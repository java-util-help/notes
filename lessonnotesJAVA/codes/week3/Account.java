public class Account {
	private String name; // instance variable
	// private olunca sadece o class'da erişilebilir
	private double balance;

	// constructor initializes name with parameter name
	public Account(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	// bu şekilde object oluşur oluşma üstüne veri yazılabilir

	public void setName(String name){
		this.name = name; /* global olan name'e veri atamak
							için this.name ile kullanıyoruz
							ki global'e, local ile karışmadan
							erişelim */
	}

	public String getName(){

		return name;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
}