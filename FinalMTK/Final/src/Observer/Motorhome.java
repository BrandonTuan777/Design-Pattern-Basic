package Observer;

public class Motorhome implements CarSound {
	Observable observable;
	public Motorhome() {
		observable = new Observable();
	}
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}
	@Override
	public void notifyObservers() {
		System.out.println("A recently Motorhome just release ");
		observable.notifyObservers();
	}
	@Override
	public void sound() {
		System.out.println("POPPING");
		notifyObservers();
	}

}
