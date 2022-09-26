package first;

public class Song {
	
	String name;
	double duration;
	String artist;
	
	Song next;
	
	public Song(String name, double duration, String artist) {
		super();
		this.name = name;
		this.duration = duration;
		this.artist = artist;
		this.next = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		if(this == null) return "[]";
		return "Song [name=" + name + ", duration=" + duration + ", artist=" + artist + ", next=" + next + "]";
	}
	
	
	
}
