package AbstractFactory;

public class Emulator {

	public static void main(String[] args) {
		Emulator emulator =new Emulator();
		AbstractCarFactory carFactory= new ReckonCarFactory();
		emulator.emulator(carFactory);
	}
	
	void emulator(AbstractCarFactory carFactory) {
		CarSound van= carFactory.createVan();
		CarSound lamborghini= carFactory.createLamborghini();
		CarSound motorhome = carFactory.createMotorhome();
		CarSound carToy = carFactory.createCarToy();
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
