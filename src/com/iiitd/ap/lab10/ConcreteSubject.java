package com.iiitd.ap.lab10;

import java.util.HashSet;

public class ConcreteSubject implements Subject, Runnable {
	private HashSet<Observer> observers = new HashSet<Observer>();
	private TemperatureLog Delhi, Kolkata, Mumbai;
	public ConcreteSubject() {
		Delhi = new TemperatureLog(35.0, "Delhi");
		Kolkata = new TemperatureLog(35.0, "Kolkata");
		Mumbai = new TemperatureLog(35.0, "Mumbai");
	}
	public void register(Observer ob) {
		observers.add(ob);
		System.out.println("New Observer Added");
	}
	public void unregister(Observer ob) {
		observers.remove(ob);
		System.out.println("Observer Removed");
	}
	public void updateDelhiLog(Double temperature) {
		System.out.println("Delhi : " + temperature);
		Delhi.setTemperature(temperature);
		//notifyObservers();
	}
	public void updateKolkataLog(Double temperature) {
		System.out.println("Kolkata : " + temperature);
		Kolkata.setTemperature(temperature);
		//notifyObservers();
	}
	public void updateMumbaiLog(Double temperature) {
		System.out.println("Mumbai : " + temperature);
		Mumbai.setTemperature(temperature);
		//notifyObservers();
	}
	public void run() {
		while(true) {
			notifyObservers();
			try {
				Thread.sleep(5000);
			} catch(InterruptedException ex) {System.out.println("Sensor Interrupted!");}
		}
	}
	public void notifyObservers() {
		System.out.println("Updating Observers");
		for(Observer ob : observers) {
			ob.update(Delhi, Kolkata, Mumbai);
		}
		System.out.println("Observers Updated!");
	}
}
