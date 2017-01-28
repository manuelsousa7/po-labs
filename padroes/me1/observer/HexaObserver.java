public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		_subject = subject;
		_subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Hexa String: " + Integer.toHexString( _subject.getState() ) );
	}
}