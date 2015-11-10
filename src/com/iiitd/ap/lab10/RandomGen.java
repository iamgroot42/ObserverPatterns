//@author : Anshuman Suri - 2014021
//@author : Satyam Kumar - 2014096

package com.iiitd.ap.lab10;

// A LCG (Linear Congruential Generator) with :
//X(n+1) = [ a*X(n) + c] % m
class RandomGen {
	 static long a=31;
	 static long c=896191; //Prime
	 static long m=1000000000; 
	 static long current;
	 static
	 {
		current=System.currentTimeMillis() % 1019 + 7; 
	 }
	 public static double getDouble()
	 {
		 current=(a*current+c)%m;
		 double ret=(double)(((double)current)/((double)m));
		 return ret;
	 }
	 public static boolean getBoolean()
	 {
		 current=(a*current+c)%m;
		 double ret=(double)(((double)current)/((double)m));
		 if(ret < 0.5) return true;
		 else return false;
	 }
}
