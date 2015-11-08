package com.iiitd.ap.lab10;

<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.FileWriter;
=======
import java.io.FileOutputStream;
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTemperature implements Observer {
<<<<<<< HEAD
	BufferedWriter f;
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		try {
			f = new BufferedWriter(new FileWriter("SerializeTemp.txt",true));
			f.write(Delhi.getLocation()+" : "+Delhi.getTemperature());
			f.write(Delhi.getLocation()+" : "+Kolkata.getTemperature());
			f.write(Delhi.getLocation()+" : "+Mumbai.getTemperature());
		} catch(IOException ex) {
			System.out.println("Something wrong with writing file");
=======
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
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
		} finally {
			try { if(f != null) f.close(); } catch(Exception ex) {System.out.println("Couldn't close file!");}
		}
	}
}
