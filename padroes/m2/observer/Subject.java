import java.util.*;
public class Subject{
	private List<Observer> _obs;
	private int _state;
	public Subject(){
		_obs = new ArrayList<Observer>();
	}
	public void add(Observer o){
		_obs.add(o);
	}
	public void setState(int newState){
		_state = newState;
		this.update();
	}
	public int getState(){
		return _state;
	}
	public void update(){
		for(Observer o : _obs){
			o.update();
		}
	}
}