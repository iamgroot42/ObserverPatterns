//@author : Anshuman Suri - 2014021
//@author : Satyam Kumar - 2014096

package com.iiitd.ap.lab10;

public class TemperaturePredictor2 implements Observer {
	String name;
	double meanDelhi,meanKolkata,meanMumbai;
	int n;
	public TemperaturePredictor2(String name) {
		this.name = name;
		meanDelhi=meanKolkata=meanMumbai=35.0;
		n=1;
	}
	public double CalcAvg(String arre) {
		double c,mean,ret,sign;
		mean=35.0;
		if(arre.equals("Delhi")) mean=meanDelhi;
		else if(arre.equals("Kolkata")) mean=meanKolkata;
		else if(arre.equals("Mumbai")) mean=meanMumbai;
		if(RandomGen.getBoolean()) sign=1; else sign=-1;
		c=(RandomGen.getDouble() * (n+1) * sign * mean)/(100.0); //Assumption : +-1% variation from mean
		if(mean+c>0) ret=mean+c;
		else ret=mean;
		return ret;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		meanDelhi=(Delhi.getTemperature()+(n*meanDelhi))/(n+1);
		meanKolkata=(Kolkata.getTemperature()+(n*meanKolkata))/(n+1);
		meanMumbai=(Mumbai.getTemperature()+(n*meanMumbai))/(n+1);
		System.out.println("--------------------------------------------------");
		System.out.println("Temprature Prediction by " + name + " (Temprature Predictor 2) : ");
		System.out.println("Delhi : " + CalcAvg("Delhi"));
		System.out.println("Kolkata : " + CalcAvg("Kolkata"));
		System.out.println("Mumbai : " + CalcAvg("Mumbai"));
		System.out.println("--------------------------------------------------");
	}
	public String getName() {
		return name;
	}
}
