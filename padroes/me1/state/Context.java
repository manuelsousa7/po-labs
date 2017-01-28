public class Context{
	private State _state;
	public Context(){
		_state = null;
	}
	public void setState(State state){
		_state = state;
	}
	public State getState(){
		return _state;
	}
}