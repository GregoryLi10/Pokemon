package pokemon;

import java.util.ArrayList;

public class TeamThings extends PokeTeam{

	public TeamThings() {
		super("TeamThings");
		
	}
	
	public ArrayList<Pokemon> createTeam(){
		ArrayList<Pokemon> theList = new ArrayList<Pokemon>();
		theList.add(new broccoli());
		theList.add(new cheeto());
		theList.add(new duck());
		return theList;
		
	}

}