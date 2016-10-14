package factorymethod;

public class Runner {
	public static void main(String[] args) {
		Vehicle myVehicle = FactoryMethod.getInstance(Model.BMW);
		myVehicle.move();
		FactoryMethod.getInstance(Model.MERCEDES).move();
	}
}
