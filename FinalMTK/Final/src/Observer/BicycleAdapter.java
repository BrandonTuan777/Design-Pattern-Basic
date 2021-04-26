package Observer;

public class BicycleAdapter implements CarSound{
	Bicycle bicycle;
	Observable observable;
	public BicycleAdapter(Bicycle bicycle) {
		observable=new Observable();
		this.bicycle=bicycle;
	}
	@Override
	public void sound() {
		bicycle.tingting();
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		System.out.println("A Bicycle just come from a lab ");
		
	}

}
