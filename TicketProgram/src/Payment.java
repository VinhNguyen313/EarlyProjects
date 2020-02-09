
public class Payment 
{
	String Cnumber;
	String exDate;
	
	public String getCnumber() {
		return Cnumber;
	}
	public void setCnumber(String cnumber) {
		Cnumber = cnumber;
	}
	public String getExDate() {
		return exDate;
	}
	public void setExDate(String exDate) {
		this.exDate = exDate;
	}
	public boolean verify(int price) {
		if(Cnumber.equals("8593830039483939") && exDate.equals("7/20") && (price<=4500)) {
			return true;
		}else if(Cnumber.equals("293839384393034") && exDate.equals("2/22") && (price<=25000)) {
			return true;
		}else {
		return false;
		}
	}
	
}
