package Observer;

public class CarToy implements CarSound {
	Observable observable;
	public CarToy() {
		observable = new Observable();
	}
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		System.out.println("A recently CarToy just release ");
		
	}
	@Override
	public void sound() {
		System.out.println("PIPIP");
		notifyObservers();
	}

}
