//@author : Satyam Kumar - 2014096
//@author : Anshuman Suri - 2014021

package com.iiitd.ap.lab10;

public class Main {

	public static void main(String[] args) {
		Thread Tsensor, Tdelhi, Tmumbai, Tkolkata;
		ConcreteSubject sensor = new ConcreteSubject();
		sensor.register(new SerializeTemperature("WeatherLog"));
		sensor.register(new TemperaturePredictor1("BBC"));
		sensor.register(new TemperaturePredictor2("Yahooweather"));
		sensor.register(new TemperaturePredictor3("PotatoServices"));
		sensor.register(new GenerateStats("GoogleWeatherStats"));
		(Tsensor = new Thread(sensor)).start();
		(Tdelhi = new Thread(new LogUpdater(sensor, "Delhi"))).start();
		(Tmumbai = new Thread(new LogUpdater(sensor, "Kolkata"))).start();
		(Tkolkata = new Thread(new LogUpdater(sensor, "Mumbai"))).start();
		try {
			Tsensor.join(); Tdelhi.join(); Tmumbai.join(); Tkolkata.join(); 
		} catch(InterruptedException ex) { System.out.println("Main Interrupted!"); }
	}

}