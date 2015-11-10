//@author : Satyam Kumar - 2014096
//@author : Anshuman Suri - 2014021

package com.iiitd.ap.lab10;

import java.io.Serializable;

public class TemperatureLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Double temperature;
	private String Location;
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
}