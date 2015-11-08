package com.iiitd.ap.lab10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTemperature implements Observer {
	ObjectOutputStream f;
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		try {
			f = new ObjectOutputStream(new FileOutputStream("SerializeTemp.dat"));
			/*Need to make changes to append at the end*/
			f.writeObject(Delhi);
			f.writeObject(Kolkata);
			f.writeObject(Mumbai);
			
		} catch(IOException ex) {
			System.out.println("Something wrong with writing file\n");
		} finally {
			try { if(f != null) f.close(); } catch(Exception ex) {System.out.println("Couldn't close file!");}
		}
	}
}
