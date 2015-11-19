package game;

import java.awt.Color;
import java.util.*;
import desktop_codebehind.Car;
import desktop_resources.GUI;
import spillere.*;

public class CarFactory {
	// Variable
	private Color[] bilFarver = {
			Color.BLUE,
			Color.BLACK,
			Color.RED,
			Color.GREEN,
			Color.YELLOW,
			Color.CYAN
	};
	private Car[] cars;
	
	public CarFactory() {
		
	}
	
	public void addCarsToGUI(Spiller[] spillere) {
		cars = new Car[spillere.length];
		for (int i = 0; i < spillere.length; i++) {
			GUI.addPlayer(spillere[i].getNavn(), spillere[i].getBalance(), new Car.Builder().primaryColor(bilFarver[i]).typeCar().build());
		}
	}
}
