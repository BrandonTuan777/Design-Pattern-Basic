package Observer;

public interface CarSoundObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();

}
