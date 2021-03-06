package Adapter;

public class Emulator {

	public static void main(String[] args) {
		Emulator emulator =new Emulator();
		emulator.emulator();
	}
	
	void emulator() {
		CarSound van= new Van();
		CarSound lamborghini= new Lamborghini();
		CarSound motorhome = new Motorhome();
		CarSound carToy = new CarToy();
		CarSound bicycle = new BicycleAdapter(new Bicycle());
		
		System.out.println("\nEmulator Car: With Bicycle Adapter");
		
		emulator(van);
		emulator(lamborghini);
		emulator(motorhome);
		emulator(carToy);
		emulator(bicycle);
	}
	
	void emulator(CarSound car) {
		car.sound();
	}
}
