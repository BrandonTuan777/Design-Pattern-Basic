package Observer;

public class CarSoundCounter implements CarSound {
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
	CarSound car;
	static int numberCarSound;
	
	public CarSoundCounter(CarSound car) {
		this.car = car;
	}
	
	@Override
	public void sound() {
		car.sound();
		numberCarSound++;
	}
	public static int getCarSound() {
		return numberCarSound;
	}

}
