package Decorator;

public class Emulator {

	public static void main(String[] args) {
		Emulator emulator =new Emulator();
		emulator.emulator();
	}
	
	void emulator() {
		CarSound van= new CarSoundCounter(new Van() ) ;
		CarSound lamborghini= new CarSoundCounter(new Lamborghini()) ;
		CarSound motorhome = new CarSoundCounter(new Motorhome()) ;
		CarSound carToy = new CarSoundCounter(new CarToy()) ;
		CarSound bicycle = new BicycleAdapter(new Bicycle());
		
		System.out.println("\nEmulator Car: With Bicycle Adapter + Decorator");
		
		emulator(van);
		emulator(lamborghini);
		emulator(motorhome);
		emulator(carToy);
		emulator(bicycle);
		
		System.out.println("All the car sound " + CarSoundCounter.getCarSound() + " times");
	}
	
	
	
	void emulator(CarSound car) {
		car.sound();
	}
}
