package com.iiitd.ap.lab10;

import java.util.Random;

public class LogUpdater implements Runnable {
	ConcreteSubject sensor;
	String Location;
	double temperature;
	public LogUpdater(ConcreteSubject sensor, String Location) {
		this.sensor = sensor;
		this.Location = Location;
	}

	public void run() {
		while(true)
		{
			try {
				Thread.sleep(5000);
			} catch(InterruptedException ex) {System.out.println(Location + " Log Updater Interrupted!");}
			temperature = RandomGen.getDouble() * 50;
			if(Location.equals("Delhi")) sensor.updateDelhiLog(temperature);
			if(Location.equals("Kolkata")) sensor.updateKolkataLog(temperature);
			if(Location.equals("Mumbai")) sensor.updateMumbaiLog(temperature);
		}
	}
}