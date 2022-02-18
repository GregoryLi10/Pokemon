package pokemon;

import java.util.ArrayList;

public class TeamIvy extends PokeTeam{
	
	public TeamIvy() {
		super("TeamIvy");
		// TODO Auto-generated constructor stub
	}

	ArrayList<Pokemon> pokemon_list;
	
	@Override
	public ArrayList<Pokemon> createTeam() {
		pokemon_list = new ArrayList<Pokemon>();
		pokemon_list.add(new Squirtle());
		pokemon_list.add(new Gastly());
		pokemon_list.add(new Snorlax());
		return pokemon_list;
	}

}
