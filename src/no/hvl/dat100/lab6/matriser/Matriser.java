package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
	
		
		for (int i = 0; i < matrise.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matrise[i].length; j++) {
				if(i < matrise[i].length - 1) {
					
					System.out.print(matrise[i][j] + ", ");
					
				} else {
					
					System.out.print(matrise[i][j]);
					
				}
				System.out.print("}");
			}
			
			
		}
		
		

		
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tabellTxt = "{ ";
		
		for (int i = 0; i < matrise.length; i++) {
			
			tabellTxt += "{";
			
			for (int j = 0; j < matrise[i].length; j++) {
				
				if (j < matrise[i].length - 1) {
					
					tabellTxt += matrise[i][j] + ", ";
					
				} else {
					
					tabellTxt += matrise[i][j];
					
				}
			}
			
			tabellTxt += "}";
			
			if (i < matrise.length - 1) {
				
				tabellTxt += ",";
				
			}
		}
		
		tabellTxt += " }";
		
		return tabellTxt;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		
		
		for (int i = 0; i < matrise.length; i++ ) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				
				matrise[i][j] = matrise[i][j] * tall;
				
			}
			
		}
		
		return matrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean returverdi = Arrays.equals(a, b);
		
		return returverdi;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
