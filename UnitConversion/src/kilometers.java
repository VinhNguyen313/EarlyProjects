public class kilometers {
	 private double miles;
	 private double hours;
	 private double minutes;
	 public double toKPH() {
		miles m = new miles(miles,hours,minutes);
		return m.toMPH()*(8.0)/(5.0);
	 }
	 public double toKm() {
		 return miles*(8.0/5.0);
	 }
	 public kilometers() {
		 miles = 0;
		 hours = 0;
		 minutes = 0;
	 }
	 public kilometers(double a, double b, double c) {
		 miles = a;
		 hours = b;
		 minutes = c;
	 }
	 public void setmiles(double a) {
		 miles =a;
	 }
	 public void setHours(double a) {
		 hours =a;
	 }
	 public void setMinutes(double a) {
		 minutes =a;
	 }
	 public double getMiles() {
		 return miles;
	 }
	 public double getHours() {
		 return hours;
	 }
	 public double getMinutes() {
		 return minutes;
	 }
}
