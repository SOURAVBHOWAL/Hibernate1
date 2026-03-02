package AbstractOverrideExample;

public class PetrolEngine implements Engine{
	@Override
	public void startEngine() {
		System.out.println("less vibration");
	}
}
