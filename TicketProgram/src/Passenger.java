
public class Passenger {
	int childNo;
	int adultNo;
	int finalprice;

	public Passenger() {
		childNo = 0;
		adultNo = 0;
		finalprice = 0;
	}

	public Passenger(int ChildNo, int AdultNo) {
		childNo = ChildNo;
		adultNo = AdultNo;

	}

	public int getFinalPrice(City destination) {
		finalprice = (int) (destination.price * adultNo + destination.price * .6 * childNo);
		return finalprice;
	}

	public int getChildNo() {
		return childNo;
	}

	public void setChildNo(int childNo) {
		this.childNo = childNo;
	}

	public int getAdultNo() {
		return adultNo;
	}

	public void setAdultNo(int adultNo) {
		this.adultNo = adultNo;
	}

}
