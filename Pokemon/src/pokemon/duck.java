package pokemon;

public class duck extends Pokemon{

	public duck() {
		super("duck", 2, 5, "1HP.png", new Move[] { new Move("Bark", 0, 5, 0),
				new Move("Bite", 1, 10, 0), new Move("Cook", 2, 5, 0), new Move("duck.duck.goose", 0, 5, 0)});
		
	}

}