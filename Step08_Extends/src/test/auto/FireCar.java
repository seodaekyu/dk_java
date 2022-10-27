package test.auto;

public class FireCar extends Car {

	public FireCar(Engine engine) {
		super(engine);	
	}
	
	public void water() {
		System.out.println("물을 발사해요!");
	}
}
