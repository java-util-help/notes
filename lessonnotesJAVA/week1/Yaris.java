import java.util.Random;

public class Yaris{
	public static void main(String[] args) {
		int tav=0, kap=0, iht;
		int x = 70;
		Random rNesne = new Random();
		while (kap<x && tav<x) {
			iht = rNesne.nextInt(10)+1; //rastgele sayi uretir
			int kAdim=0, tAdim=0;
			
			// Kap. icin durumlar
			if(iht>0 && iht<=5)
				kAdim = 3;
			else if(x>5 && x<=7)
				kAdim = -6;
			else if(x>7 && x<=10)
				kAdim = 1;
			///

			// Tav. icin durumlar
			if(iht>0 && iht<=2)
				tAdim = 0;
			else if(iht>2 && iht<=4)
				tAdim = 9;
			else if(iht>4 && iht<=5)
				tAdim = -12;
			else if(iht>5 && iht<=8)
				tAdim = 1;
			else if(iht>8 && iht<=10)
				tAdim = -2;
			///
			kap += kAdim;
			if(kap<0)
				kap=0;

			tav += tAdim;
			if(tav<0)
				tav=0;

			for (int i=0; i<x; i++) {
				if(kap==i)
					System.out.print("K");
				else
					System.out.print("-");
			}
			System.out.println(" ");
			for (int i=0; i<x; i++) {
				if(tav==i)
					System.out.print("T");
				else
					System.out.print("-");
			}
			System.out.println("\n");
			System.out.println("Üretilen Sayi"+iht);
		}
	}
}