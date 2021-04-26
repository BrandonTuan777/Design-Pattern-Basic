package Observer;

public class Van implements CarSound{
	Observable observable;
	public Van() {
		observable = new Observable();
	}
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}
	@Override
	public void notifyObservers() {
		System.out.println("A recently Van just release ");
		observable.notifyObservers();
		
		
	}
	@Override
	public void sound() {
		System.out.println("RUMBLING");
		notifyObservers();
	}
	
}
