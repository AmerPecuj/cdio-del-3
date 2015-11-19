package game;

import java.awt.Color;
import desktop_codebehind.Car;

public class CarCreator {
	public CarCreator() {
		
	}
	
	public Car getCar(Color farve) {
		return new Car.Builder()
				.primaryColor(farve)
				.typeTractor()
				.build();
	}
}
