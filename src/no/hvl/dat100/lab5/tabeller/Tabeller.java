package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("{");
		
		for (int i = 0; i < tabell.length; i++) {
			
			
			if(i < tabell.length - 1) {
				
				System.out.print(tabell[i] + ", ");
				
			} else {
				
				System.out.print(tabell[i]);
				
			}
		}
		
		System.out.print("}");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabellTxt = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length - 1) {
				tabellTxt += tabell[i] + ", ";
			} else {
				tabellTxt += tabell[i];
			}
		}
		
		tabellTxt += "]";
		
		return tabellTxt;
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int total = 0;
		
		for (int i = 0; i < tabell.length; i++ ) {
			
			total += tabell[i];
			
		}
		
		return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean innhold = false;
		
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tall == tabell[i]) {
				innhold = true;
			} 
		}
		return innhold;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		
		int posisjonTall = -1;
		
		
		
		while (tabell[i] != tall && i < tabell.length - 1) {
			i++;
			
			if(tabell[i] == tall) {
				posisjonTall = i;
			} else {
				posisjonTall = -1;
			}
			
		}
		return posisjonTall;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		 for(int i=0; i<tabell.length/2; i++){
	            int temp = tabell[i];
	            tabell[i] = tabell[tabell.length -i -1];
	            tabell[tabell.length -i -1] = temp;
	        }
		 return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		{
	        // base case
	        if (tabell == null || tabell.length <= 1) {
	            return true;
	        }
	 
	        for (int i = 0; i < tabell.length - 1; i++)
	        {
	            if (tabell[i] > tabell[i + 1]) {
	                return false;
	            }
	        }
	 
	        return true;
	    }
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int nyTabell[] = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			
			nyTabell[i] = tabell1[i];
			
		}
		
		for (int j = 0; j < tabell2.length; j++) {
			
			nyTabell[j + tabell1.length] = tabell2[j];
			
		}
		
		return nyTabell;
	}
	
}
