package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
	
//	Song e = new Song("As It Was", 3.4, "Harry Styles");
//	
//
//	Playlist favs = new Playlist(e);
//	
//	favs.add(new Song("Dandelions", 2.5, "Ruth B."));
//	
//	System.out.println(favs.toString());
//	favs.play("Dandelions");
//	
//	return;
		
		//Question1
		//NAME FILTER
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, new Student(1, "Pranay", 'A'));
		map.put(2, new Student(1, "Rumi", 'B'));
		map.put(3, new Student(1, "Sumit", 'C')); 
		map.put(4, new Student(1, "Nora", 'D')); 
		map.put(5, new Student(1, "Sagari", 'E'));
		
		System.out.println("Enter a character of your choice :");
		char c = sc.next().charAt(0);
		
		for(Student e: map.values()) {
			if(e.name.charAt(0) == c) {
				System.out.println(e.name);
			}
		}
		
	}

}

//Implement a queue for your favourite playlist of songs where you can add songs and also play songs. 
//It should also give your how many songs are remaining in your playlist.