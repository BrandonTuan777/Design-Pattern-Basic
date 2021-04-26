package Decorator;

public class CarSoundCounter implements CarSound {
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
