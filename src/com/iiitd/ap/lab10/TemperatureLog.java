package com.iiitd.ap.lab10;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Random;

public class TemperatureLog implements Serializable, Runnable {
	private static final long serialVersionUID = 1L;
	private Double temperature;
	private String Location;
	Random rand = new Random();
=======

public class TemperatureLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Double temperature;
	private String Location;
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
	public TemperatureLog(Double temperature, String Location) {
		this.temperature = temperature;
		this.Location = Location;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
<<<<<<< HEAD
	public void run() {
		while(true)
		{
			temperature = rand.nextDouble() * 50;
			try { 
				Thread.sleep(5000);
			} catch(InterruptedException ex) {System.out.println("Interrupted");}
		}
	}
=======
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
}
