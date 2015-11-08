package com.iiitd.ap.lab10;

public class TemperaturePredictor1 implements Observer {
<<<<<<< HEAD
	TemperatureLog[] Delhi, Kolkata, Mumbai;
	int idxDelhi, idxKolkata, idxMumbai;
	public TemperaturePredictor1() {
		Delhi = new TemperatureLog[5];
		Kolkata = new TemperatureLog[5];
		Mumbai = new TemperatureLog[5];
		idxDelhi = idxKolkata = idxMumbai = 0;
	}
	public double CalcAvg(TemperatureLog arr[]) {
		double avg = 0;
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null)
				avg += arr[i].getTemperature();
		}
		avg /= arr.length;
		return avg;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		this.Delhi[idxDelhi++] = Delhi; if(idxDelhi == 5) idxDelhi = 0;
		this.Kolkata[idxKolkata++] = Kolkata; if(idxKolkata == 5) idxKolkata = 0;
		this.Mumbai[idxMumbai++] = Mumbai; if(idxMumbai == 5) idxMumbai = 0;
=======
	Double[] Delhi, Kolkata, Mumbai;
	int idxDelhi, idxKolkata, idxMumbai;
	public TemperaturePredictor1() {
		Delhi = new Double[5];
		Kolkata = new Double[5];
		Mumbai = new Double[5];
		idxDelhi = idxKolkata = idxMumbai = 0;
	}
	public double CalcAvg(Double arr[]) {
		double avg = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				avg += arr[i];
				cnt++;
			}
		}
		avg /= cnt;
		return avg;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		this.Delhi[idxDelhi++] = Delhi.getTemperature(); if(idxDelhi == 5) idxDelhi = 0;
		this.Kolkata[idxKolkata++] = Kolkata.getTemperature(); if(idxKolkata == 5) idxKolkata = 0;
		this.Mumbai[idxMumbai++] = Mumbai.getTemperature(); if(idxMumbai == 5) idxMumbai = 0;
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
		System.out.println("--------------------------------------------------");
		System.out.println("Temprature Prediction by Temprature Predictor 1 : ");
		System.out.println("Delhi : " + CalcAvg(this.Delhi));
		System.out.println("Kolkata : " + CalcAvg(this.Kolkata));
		System.out.println("Mumbai : " + CalcAvg(this.Mumbai));
		System.out.println("--------------------------------------------------");
	}
}
