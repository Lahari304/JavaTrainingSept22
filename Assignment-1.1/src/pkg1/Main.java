package pkg1;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("**FIRST QUESTION**");
//		
//		String s = sc.next(); //aabbbbeeeeffggg
//		int count = 1, i=0;
//								
//		for(int j=1; j<s.length(); j++) {
//			if(s.charAt(i) != s.charAt(j)) {
//				s = s.substring(0, i+1) + count + s.substring(j, s.length());
//				count = 1;
//				i+= 2;
//				j = i;
//			}
//			else {
//				count++;
//			}
//		}
//		
//		s = s.substring(0,i+1) + count;
//		System.out.println("Size reducted string: "+ s);
		
		
		
		System.out.println("**SECOND QUESTION**");
		
		int rows = 5, cols = 4, rowUp = 0, rowDown = rows-1, 
				colLeft = 0, colRight = cols -1;
		
		int [][]matrix = { {1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16},
							{17,18,19,20}};
		
		while(rowUp<=rowDown && colLeft<=colRight) {
			
			//right
			for(int a=colLeft; a<=colRight; a++) {
				System.out.print(matrix[rowUp][a]+" ");
			}
			rowUp++;
			System.out.println();
			
			//down
			for(int a=rowUp; a<=rowDown; a++) {
				System.out.print(matrix[a][colRight]+" ");
			}
			colRight--;
			System.out.println();
			
			//left
			for(int a=colRight; a>=colLeft; a--) {
				System.out.print(matrix[rowDown][a]+" ");
			}
			rowDown--;
			System.out.println();

			//up
			for(int a=rowDown; a>=rowUp; a--) {
				System.out.print(matrix[a][colLeft]+" ");
			}
			colLeft++;
			System.out.println();

		}
				
		sc.close();

	}

}

