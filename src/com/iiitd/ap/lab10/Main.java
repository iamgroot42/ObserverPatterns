package com.iiitd.ap.lab10;

public class Main {

	public static void main(String[] args) {
		Thread Tsensor, Tdelhi, Tmumbai, Tkolkata;
		ConcreteSubject sensor = new ConcreteSubject();
		sensor.register(new SerializeTemperature());
		sensor.register(new TemperaturePredictor1());
		sensor.register(new TemperaturePredictor2());
		sensor.register(new GenerateStats());
		(Tsensor = new Thread(sensor)).start();
		(Tdelhi = new Thread(new LogUpdater(sensor, "Delhi"))).start();
		(Tmumbai = new Thread(new LogUpdater(sensor, "Kolkata"))).start();
		(Tkolkata = new Thread(new LogUpdater(sensor, "Mumbai"))).start();
		try {
			Tsensor.join(); Tdelhi.join(); Tmumbai.join(); Tkolkata.join(); 
		} catch(InterruptedException ex) { System.out.println("Main Interrupted!"); }
	}

}