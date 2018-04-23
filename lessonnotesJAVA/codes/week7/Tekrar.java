// Quiz sorusu;
// bir dizide 0-10 arasında en çok tekrar eden sayiyi bulur.

public class Tekrar {
	
	public static findMaxOccurence(int[] dizi) {
		int maxFreq = 0, maxValue = 0;
		int[] frequency = new int[11];

		for (int i=0; i<dizi.length; i++) {
			frequency[dizi[i]]++;
		}

		maxFreq = frequency[0];
		for (int i=1; i<frequency.length; i++) {
			if(frequency[i] > maxFreq)
				maxFreq = frequency[i];
				maxValue = i;
		}

		return maxValue;
	}
}