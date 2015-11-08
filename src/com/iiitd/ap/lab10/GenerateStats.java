package com.iiitd.ap.lab10;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyCom implements Comparator<TemperatureLog> {
	public int compare(TemperatureLog a, TemperatureLog b) {
		return a.getTemperature().compareTo(b.getTemperature());
	}
}
public class GenerateStats implements Observer {
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
	private double getMedian(TreeSet<Double> x)
	{
		int i,n=x.size();
		i=0;
		Iterator<Double> iterator;
		iterator = x.iterator();
		while(iterator.hasNext())
		{
			if(i>=n/2) break;
			i++;
		}
		return (double)iterator.next();
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
		}
		double meanDelhi,meanKolkata,meanMumbai;
		meanDelhi=this.getMedian(this.Delhi);
		meanKolkata=this.getMedian(this.Kolkata);
		meanMumbai=this.getMedian(this.Mumbai);
		/* TreeSet doesn't have methods to get middle element o.O Collections.BinarySearch() is only for keys.*/
		System.out.println("--------------------------------------------------");
		System.out.println("Stats are : ");
		System.out.printf("Delhi - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumDelhi/LogsDelhi.size(), meanDelhi, this.Delhi.first(), this.Delhi.last());
		System.out.printf("Kolkata - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumKolkata/LogsKolkata.size(), meanKolkata, this.Kolkata.first(), this.Kolkata.last());
		System.out.printf("Mumbai - Mean : %f ; Median : %f ; Min : %f ; Max : %f" + System.lineSeparator(), 
				sumMumbai/LogsMumbai.size(), meanMumbai, this.Mumbai.first(), this.Mumbai.last());
		System.out.println("--------------------------------------------------");
	}
}