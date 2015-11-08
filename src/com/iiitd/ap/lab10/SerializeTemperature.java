package com.iiitd.ap.lab10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTemperature implements Observer {
	BufferedWriter f;
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		try {
			f = new BufferedWriter(new FileWriter("SerializeTemp.txt",true));
			f.write(Delhi.getLocation()+" : "+Delhi.getTemperature());
			f.write(Delhi.getLocation()+" : "+Kolkata.getTemperature());
			f.write(Delhi.getLocation()+" : "+Mumbai.getTemperature());
		} catch(IOException ex) {
			System.out.println("Something wrong with writing file");
		} finally {
			try { if(f != null) f.close(); } catch(Exception ex) {System.out.println("Couldn't close file!");}
		}
	}
}
