public abstract class Game{
	abstract void startGame();
	abstract void endGame();
	abstract void initialize();
	public void play(){
		initialize();
		startGame();
		endGame();
	}
}