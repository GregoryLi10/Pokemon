package pokemon;

import java.util.ArrayList;

public class TeamGregory extends PokeTeam{

	public TeamGregory() {
		super("Melatonin allows you to 'Stay Asleep Longer'");
	}

	@Override
	public ArrayList<Pokemon> createTeam() {
		ArrayList<Pokemon> arr=new ArrayList<Pokemon>();
		arr.add(new OnePunchMan());
		arr.add(new Melatonin());
		arr.add(new OneHitpoint());
		return arr;
	}

}
