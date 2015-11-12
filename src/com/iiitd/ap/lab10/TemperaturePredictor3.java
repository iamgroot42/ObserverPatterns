//@author : Anshuman Suri - 2014021
//@author : Satyam Kumar - 2014096

package com.iiitd.ap.lab10;

import java.util.ArrayList;

public class TemperaturePredictor3 implements Observer{
	double meanDelhi,meanKolkata,meanMumbai;
	ArrayList<Double> readDelhi,readKolkata,readMumbai;
	int n;
	public TemperaturePredictor3() {
		meanDelhi=meanKolkata=meanMumbai=35.0;
		readDelhi=new ArrayList<Double>();
		readKolkata=new ArrayList<Double>();
		readMumbai=new ArrayList<Double>();
		n=0;
	}
	public double CalcAvg(String arre) {
		double ret,sum;
		ret=35.0;
		int i,j;
		sum=0;
		if(n<1) return ret;
		if(arre.equals("Delhi"))
		{
			for(i=n-1,j=1;i>0;i--,j++)
			{
				sum+=(readDelhi.get(i)-readDelhi.get(i-1))/j;
			}
			ret=readDelhi.get(n-1)+sum;
		}
		else if(arre.equals("Kolkata"))
		{
			for(i=n-1,j=1;i>0;i--,j++)
			{
				sum+=(readKolkata.get(i)-readKolkata.get(i-1))/i;
			}
			ret=readKolkata.get(n-1)+sum;
		}
		else if(arre.equals("Mumbai"))
		{
			for(i=n-1,j=1;i>0;i--,j++)
			{
				sum+=(readMumbai.get(i)-readMumbai.get(i-1))/i;
			}
			ret=readMumbai.get(n-1)+sum;
		}
		return ret;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		readDelhi.add(Delhi.getTemperature());
		readKolkata.add(Kolkata.getTemperature());
		readMumbai.add(Mumbai.getTemperature());
		n++;
		//System.out.println("length : " + readDelhi.size() + " " + readMumbai.size());
		System.out.println("--------------------------------------------------");
		System.out.println("Temprature Prediction by Temprature Predictor 3 : ");
		System.out.println("Delhi : " + CalcAvg("Delhi"));
		System.out.println("Kolkata : " + CalcAvg("Kolkata"));
		System.out.println("Mumbai : " + CalcAvg("Mumbai"));
		System.out.println("--------------------------------------------------");
	}
}
