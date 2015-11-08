package com.iiitd.ap.lab10;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.TreeSet;

class MyCom implements Comparator<TemperatureLog> {
	public int compare(TemperatureLog a, TemperatureLog b) {
		return a.getTemperature().compareTo(b.getTemperature());
	}
}
public class GenerateStats implements Observer {
<<<<<<< HEAD
	TreeSet<TemperatureLog> Delhi;
	TreeSet<TemperatureLog> Kolkata;
	TreeSet<TemperatureLog> Mumbai;
	ArrayDeque<TemperatureLog> LogsDelhi;
	ArrayDeque<TemperatureLog> LogsKolkata;
	ArrayDeque<TemperatureLog> LogsMumbai;
	double sumDelhi, sumKolkata, sumMumbai;
	public GenerateStats() {
		Delhi = new TreeSet<TemperatureLog>(new MyCom());
		Kolkata = new TreeSet<TemperatureLog>(new MyCom());
		Mumbai = new TreeSet<TemperatureLog>(new MyCom());
		LogsDelhi = new ArrayDeque<TemperatureLog>();
		LogsKolkata = new ArrayDeque<TemperatureLog>();
		LogsMumbai = new ArrayDeque<TemperatureLog>();
		sumDelhi = sumKolkata = sumMumbai = 0;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		LogsDelhi.add(Delhi);
		LogsKolkata.add(Kolkata);
		LogsMumbai.add(Mumbai);
		sumDelhi += Delhi.getTemperature(); this.Delhi.add(Delhi);
		sumKolkata += Kolkata.getTemperature(); this.Kolkata.add(Kolkata);
		sumMumbai += Mumbai.getTemperature(); this.Mumbai.add(Mumbai);
		TemperatureLog temp;
		while(LogsDelhi.size() > 100) {
			temp = LogsDelhi.poll();
			this.Delhi.remove(temp); sumDelhi -= temp.getTemperature();
		}
		while(LogsKolkata.size() > 100) {
			temp = LogsKolkata.poll();
			this.Kolkata.remove(temp); sumKolkata -= temp.getTemperature();
		}
		while(LogsMumbai.size() > 100) {
			temp = LogsMumbai.poll();
			this.Mumbai.remove(temp); sumMumbai -= temp.getTemperature();
=======
	TreeSet<Double> Delhi;
	TreeSet<Double> Kolkata;
	TreeSet<Double> Mumbai;
	ArrayDeque<Double> LogsDelhi;
	ArrayDeque<Double> LogsKolkata;
	ArrayDeque<Double> LogsMumbai;
	double sumDelhi, sumKolkata, sumMumbai;
	public GenerateStats() {
		Delhi = new TreeSet<Double>();
		Kolkata = new TreeSet<Double>();
		Mumbai = new TreeSet<Double>();
		LogsDelhi = new ArrayDeque<Double>();
		LogsKolkata = new ArrayDeque<Double>();
		LogsMumbai = new ArrayDeque<Double>();
		sumDelhi = sumKolkata = sumMumbai = 0;
	}
	public void update(TemperatureLog Delhi, TemperatureLog Kolkata, TemperatureLog Mumbai) {
		LogsDelhi.add(Delhi.getTemperature());
		LogsKolkata.add(Kolkata.getTemperature());
		LogsMumbai.add(Mumbai.getTemperature());
		sumDelhi += Delhi.getTemperature(); this.Delhi.add(Delhi.getTemperature());
		sumKolkata += Kolkata.getTemperature(); this.Kolkata.add(Kolkata.getTemperature());
		sumMumbai += Mumbai.getTemperature(); this.Mumbai.add(Mumbai.getTemperature());
		Double temp;
		while(LogsDelhi.size() > 100) {
			System.out.println("here");
			temp = LogsDelhi.poll();
			this.Delhi.remove(temp); sumDelhi -= temp;
		}
		while(LogsKolkata.size() > 100) {
			System.out.println("here");
			temp = LogsKolkata.poll();
			this.Kolkata.remove(temp); sumKolkata -= temp;
		}
		while(LogsMumbai.size() > 100) {
			System.out.println("here");
			temp = LogsMumbai.poll();
			this.Mumbai.remove(temp); sumMumbai -= temp;
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
		}
		/* TreeSet doesn't have methods to get middle element o.O Collections.BinarySearch() is only for keys.*/
		System.out.println("--------------------------------------------------");
		System.out.println("Stats are : ");
<<<<<<< HEAD
		System.out.printf("Delhi - Mean : %f ; Median : %f ; Max : %f ; Min : %f" + System.lineSeparator(), 
				sumDelhi/LogsDelhi.size(), 0.0, this.Delhi.first().getTemperature(), this.Delhi.last().getTemperature());
		System.out.printf("Kolkata - Mean : %f ; Median : %f ; Max : %f ; Min : %f" + System.lineSeparator(), 
				sumKolkata/LogsKolkata.size(), 0.0, this.Kolkata.first().getTemperature(), this.Kolkata.last().getTemperature());
		System.out.printf("Mumbai - Mean : %f ; Median : %f ; Max : %f ; Min : %f" + System.lineSeparator(), 
				sumMumbai/LogsMumbai.size(), 0.0, this.Mumbai.first().getTemperature(), this.Mumbai.last().getTemperature());
=======
		System.out.printf("Delhi - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumDelhi/LogsDelhi.size(), 0.0, this.Delhi.first(), this.Delhi.last());
		System.out.printf("Kolkata - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumKolkata/LogsKolkata.size(), 0.0, this.Kolkata.first(), this.Kolkata.last());
		System.out.printf("Mumbai - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumMumbai/LogsMumbai.size(), 0.0, this.Mumbai.first(), this.Mumbai.last());
>>>>>>> bf15f7c1a914e287dd44b5bcdfb7286be356b67d
		System.out.println("--------------------------------------------------");
	}
}
