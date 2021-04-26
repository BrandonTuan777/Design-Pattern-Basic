package AbstractFactory;

public class ReckonCarFactory extends AbstractCarFactory {

	@Override
	public CarSound createVan() {
		// TODO Auto-generated method stub
		return new CarSoundCounter(new Van());
	}

	@Override
	public CarSound createLamborghini() {
		// TODO Auto-generated method stub
		return new CarSoundCounter(new Lamborghini());
	}

	@Override
	public CarSound createMotorhome() {
		// TODO Auto-generated method stub
		return new CarSoundCounter(new Motorhome());
	}

	@Override
	public CarSound createCarToy() {
		// TODO Auto-generated method stub
		return new CarSoundCounter(new CarToy());
	}

}
