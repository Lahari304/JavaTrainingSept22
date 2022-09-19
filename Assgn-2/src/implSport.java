
public class implSport {
	
	public static Sport getSport(String sport) {
		
		if(sport == null){  
            return null;  
           }  
         if(sport.equalsIgnoreCase("FOOTBALL")) {  
                return new Football();  
              }   
          else if(sport.equalsIgnoreCase("BADMINTON")){  
               return new Badminton();  
           }
     return null;  
	}
}
