package com.iiitd.ap.lab10;

import java.util.HashSet;
import java.util.TreeSet;

public class ConcreteSubject implements Subject, Runnable {
	private HashSet<Observer> observers = new HashSet<Observer>();
	TemperatureLog Delhi, Kolkata, Mumbai;
	public ConcreteSubject() {
		Delhi = new TemperatureLog(35.0, "Delhi");
		Kolkata = new TemperatureLog(35.0, "Kolkata");
		Mumbai = new TemperatureLog(35.0, "Mumbai");
	}
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
	}
}
