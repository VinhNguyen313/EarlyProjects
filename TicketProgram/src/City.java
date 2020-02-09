import java.util.*;

public abstract class City {
	String name;
	Random rand = new Random();
	double price;
	String mode;
	String tier;

	public City() {
		name = "";
	}

	public City(String CityName, String modeTrav, String classTier) {
		name = CityName;
	}

	public double getPrice() {
		return price;
	}

	public abstract void setProperties(String CityName, String modeTrav, String classTier);

	public void setModeTrav(String modeTrav) {
		mode = modeTrav;
	}

	public void setTier(String classTier) {
		tier = classTier;
	}

}
