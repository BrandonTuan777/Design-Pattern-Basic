package Observer;

public class Lamborghini implements CarSound {
	Observable observable;
	public Lamborghini() {
		observable = new Observable();
	}
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}
	@Override
	public void notifyObservers() {
		System.out.println("A recently Lamborghini just release ");
		observable.notifyObservers();
		
	}
	@Override
	public void sound() {
		System.out.println("RUMBLING");
		notifyObservers();
	}

}
