package Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements CarSoundObservable {
	ArrayList observers = new ArrayList();
	CarSoundObservable car;	
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator iterator = observers.iterator();
		while(iterator.hasNext()) {
			Observer observer =(Observer)iterator.next();
			observer.update(car);
		}
	}
	
}
