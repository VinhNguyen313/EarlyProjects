
public class miles {
	 private double miles;
	 private double hours;
	 private double minutes;
	 public double toMPH() {
		 if(hours !=0 && minutes !=0){
		 return miles/(hours+(minutes/60.0));
		 }else if(hours !=0 && minutes == 0)
			 {return miles/(hours);}
		 else if(hours == 0 && minutes !=0 ) {
			 return miles/(minutes/60.0);
		 }else {
			 return miles/(hours+(minutes/60.0));
		 }
	 }
	 public miles() {
		 miles = 0;
		 hours = 0;
		 minutes = 0;
	 }
	 public miles(double a, double b, double c) {
		 miles = a;
		 hours = b;
		 minutes = c;
	 }
	 public void setMiles(double a) {
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
