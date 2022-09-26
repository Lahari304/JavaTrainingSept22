package first;

public class Main {
	
	public static void main(String [] args) {
	
	Song e = new Song("As It Was", 3.4, "Harry Styles");
	

	Playlist favs = new Playlist(e);
	
	favs.add(new Song("Dandelions", 2.5, "Ruth B."));
	
	System.out.println(favs.toString());
	favs.play("Dandelions");
	
	return;
	}

}

//Implement a queue for your favourite playlist of songs where you can add songs and also play songs. 
//It should also give your how many songs are remaining in your playlist.