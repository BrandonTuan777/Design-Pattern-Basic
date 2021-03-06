package Observer;

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
		
		CarZone carZone = new CarZone();
		carZone.add(van);
		carZone.add(lamborghini);
		carZone.add(motorhome);
		carZone.add(carToy);
		carZone.add(bicycle);
		
		
//		CarZone vanZone = new CarZone();
//		CarSound vanOne = carFactory.createVan();
//		CarSound vanTwo = carFactory.createVan();
//		
//		vanZone.add(vanOne);
//		vanZone.add(vanTwo);
//	
//		carZone.add(vanZone);
//		
//		System.out.println("\nCar zone listen to it");
		emulator(carZone);
//		System.out.println("\nVan zone listen to it");
//		emulator(vanZone);
		
		ObserverMan man = new ObserverMan();
		carZone.registerObserver(man);
		emulator(carZone);
	
		
		
		System.out.println("There are " + CarSoundCounter.getCarSound() + " car in the company");
	}
	
	
	
	void emulator(CarSound car) {
		car.sound();
	}
}
