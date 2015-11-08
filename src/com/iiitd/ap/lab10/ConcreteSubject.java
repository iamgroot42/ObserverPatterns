package com.iiitd.ap.lab10;

import java.util.HashSet;
<<<<<<< HEAD
import java.util.TreeSet;

public class ConcreteSubject implements Subject, Runnable {
	private HashSet<Observer> observers = new HashSet<Observer>();
	TemperatureLog Delhi, Kolkata, Mumbai;
=======

public class ConcreteSubject implements Subject, Runnable {
	private HashSet<Observer> observers = new HashSet<Observer>();
	private TemperatureLog Delhi, Kolkata, Mumbai;
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
	public ConcreteSubject() {
		Delhi = new TemperatureLog(35.0, "Delhi");
		Kolkata = new TemperatureLog(35.0, "Kolkata");
		Mumbai = new TemperatureLog(35.0, "Mumbai");
	}
<<<<<<< HEAD
	public void register(Observer newObserver) {
		observers.add(newObserver);
		System.out.println("New Observer Added");
	}
	public void unregister(Observer ob) {
		try
		{
			observers.remove(ob);
		}
		catch(Exception e)
		{
			System.out.println("Error unsubscribing observer.");
		}
		System.out.println("Observer Removed");
	}
	public void notifyObservers() {
		(new Thread(Delhi)).start();
		(new Thread(Kolkata)).start();
		(new Thread(Mumbai)).start();
	}
	public void run() {
		while(true)
		{
			System.out.println("Updating Observers");
			for(Observer ob : observers) {
				ob.update(Delhi, Kolkata, Mumbai);
			}
			System.out.println("Observers Updated!");
			try {
				Thread.sleep(5000);
			} catch(InterruptedException ex) {System.out.println("Interrupted");}
		}
=======
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
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
	}
}
