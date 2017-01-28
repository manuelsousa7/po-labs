public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void Mp4Player(String fileName) {
		System.out.println("Playing Mp4 file. Name: " + fileName);
	}

	@Override
	public void playVLC(String fileName) {
		//do nothing
	}
}