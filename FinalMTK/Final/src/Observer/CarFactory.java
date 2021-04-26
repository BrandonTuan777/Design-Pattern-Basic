package Observer;

public class CarFactory extends AbstractCarFactory {

	@Override
	public CarSound createVan() {
	
		return new Van();
	}

	@Override
	public CarSound createLamborghini() {
		
		return new Lamborghini();
	}

	@Override
	public CarSound createMotorhome() {
	
		return new Motorhome();
	}

	@Override
	public CarSound createCarToy() {
	
		return new CarToy();
	}
	

}
