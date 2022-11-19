package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate();
	public final void gameOver() {
		System.out.println("Game Over.");
	}

}

//Game is just a reference holder in abstract classes.
//it forces its child classes to have certain methods.
