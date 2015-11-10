//@author : Satyam Kumar - 2014096
//@author : Anshuman Suri - 2014021

package com.iiitd.ap.lab10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SerializeTemperature implements Observer {
	BufferedWriter f;
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		try {
			f = new BufferedWriter(new FileWriter("SerializeTemp.txt",true));
			/*Need to make changes to append at the end*/
			f.write(Delhi.getLocation()+" : "+Delhi.getTemperature()+"\n");
			f.write(Kolkata.getLocation()+" : "+Kolkata.getTemperature()+"\n");
			f.write(Mumbai.getLocation()+" : "+Mumbai.getTemperature()+"\n");
			f.write("\n");
		} catch(IOException ex) {
			System.out.println("Something wrong with writing file\n");
		} finally {
			try { if(f != null) f.close(); } catch(Exception ex) {System.out.println("Couldn't close file!");}
		}
	}
}