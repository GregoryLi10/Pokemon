package pokemon;

import java.util.ArrayList;

public class TeamNoob extends PokeTeam{

	public TeamNoob() {
		super("noob");
	}

	@Override
	public ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> arr=new ArrayList<Pokemon>();
		arr.add(new Noob());
		arr.add(new OnePunchMan());
		arr.add(new OnePunchMan());
		return arr;
	}

}
