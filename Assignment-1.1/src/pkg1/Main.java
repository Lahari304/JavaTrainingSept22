package pkg1;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**FIRST QUESTION**");
		
		String s = sc.next(); //aabbbbeeeeffggg
		int count = 1, i=0;
								//a2b4e4f2ggg
		for(int j=1; j<s.length(); j++) {
			if(s.charAt(i) != s.charAt(j)) {
				s = s.substring(0, i+1) + count + s.substring(j, s.length());
				count = 1;
				i+= 2;
				j = i;
			}
			else {
				count++;
			}
		}
		
		s = s.substring(0,i+1) + count;
		System.out.println("Size reducted string: "+ s);
		
		
		sc.close();

	}

}

