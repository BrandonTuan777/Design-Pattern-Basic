package CompositeAndInterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CarZone implements CarSound {
	ArrayList cars = new ArrayList();
		
	public void add(CarSound car) {
		cars.add(car);
	}

	@Override
	public void sound() {
		Iterator iterator = cars.iterator();
		while(iterator.hasNext()) {
			CarSound car =(CarSound)iterator.next();
			car.sound();
		}
		
	}

}
