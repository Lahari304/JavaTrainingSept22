package first;

public class Playlist {
	
	int size;
	Song first;
	Song curr;
	Song last;
	
	Playlist(){
		this.size = 0;
		
		this.first = null;
		this.curr = this.first;
		this.last = this.first;
		
		this.first.next = this.last;
		this.curr.next = this.last;
		this.last.next = this.first;
	}
	Playlist(Song first){
		this.size = 0;
		
		this.first = first;
		this.curr = this.first;
		this.last = this.first;
		
		this.first.next = this.last;
		this.curr.next = this.last;
		this.last.next = this.first;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return !(size() == 0);
	}

	public int remaining() {
		
		int count = 0;
		
		Song e = curr;
		while(e.next != first) count++;
		
		return count;
	}

	public void clear() {
		first = null;
		last = first;
		size = 0;
		return;
	}
	
	public void add(Song e) {
		
		if(first == null) {
			first = e;
			last = first;
		}
		else {
			last.next = e;
			last = e;
			if(size==1) first.next = e;
			last.next = first;
		}
		
		last.next = first;
		size++;
		System.out.println("Song added to your favourites!");
		
		return;
	}

	public Song play(String inp) {
		
		for(Song e = first; e.next!=first;  e= e.next) {
			if(e.name == inp) {
				System.out.println("Playing "+e.name+" by "+e.artist);
				curr = e;
				return curr;
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "Playlist [size=" + size + ", first=" + first.hashCode()+ ", curr=" + curr.hashCode() + ", last=" + last.hashCode() + "]";
	}

}
