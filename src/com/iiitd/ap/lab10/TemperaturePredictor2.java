package com.iiitd.ap.lab10;

import java.util.Random;

public class TemperaturePredictor2 implements Observer {
	double meanDelhi,meanKolkata,meanMumbai;
	int n;
	public TemperaturePredictor2() {
		meanDelhi=meanKolkata=meanMumbai=0;
		n=0;
	}
	public double CalcAvg(String arre) {
		Random rand = new Random();
		double c,mean,ret,sign;
		mean=0;
		if(rand.nextBoolean()) sign=1; else sign=-1;
		c=(rand.nextDouble() * (n+1) * sign)/(10.0); //Assumption : +-10% variation from mean
		if(arre.equals("Delhi")) mean=meanDelhi;
		else if(arre.equals("Kolkata")) mean=meanKolkata;
		else if(arre.equals("Mumbai")) mean=meanMumbai;
		if(mean+c>0) ret=mean+c;
		else ret=mean;
		return ret;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		System.out.println("--------------------------------------------------");
		System.out.println("Temprature Prediction by Temprature Predictor 1 : ");
		System.out.println("Delhi : " + CalcAvg("Delhi"));
		System.out.println("Kolkata : " + CalcAvg("Kolkata"));
		System.out.println("Mumbai : " + CalcAvg("Mumbai"));
		System.out.println("--------------------------------------------------");
	}
}
