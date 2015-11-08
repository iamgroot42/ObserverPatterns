package com.iiitd.ap.lab10;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject sensor = new ConcreteSubject();
		sensor.register(new GenerateStats());
		sensor.register(new TemperaturePredictor1());
		sensor.notifyObservers();
		(new Thread(sensor)).start();
		
	}

}
