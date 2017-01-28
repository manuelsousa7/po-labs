import java.util.*;

public class Subject {
	private List<Observer> _obs = new ArrayList<Observer>();
	private int _state;
	public int getState() {
		return _state;
	}
	public void setState(int newState) {
		_state = newState;
		notifyAllObservers();
	}
	public void attach(Observer observer) {
		_obs.add(observer);
	}
	public void notifyAllObservers() {
		for (Observer i : _obs) {
			i.update();
		}
	}
}