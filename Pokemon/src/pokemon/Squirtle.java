package pokemon;

public class Squirtle extends Pokemon{

	public Squirtle() {
		super("Squirtle", 1, 40, "1HP.png", new Move[] {new Move("Tail Whip", 0, 50, 2), new Move("Water Gun", 1, 20, 0), new Move("Hydro Pump", 1, 30, 3), new Move("Rapid Spin", 0, 20, 1)});
	}

}
