
public class Foreign extends City {

	public Foreign() {
		super();
	}

	public void setProperties(String CityName, String modeTrav, String tier) {
		name = CityName;

		if (modeTrav.equalsIgnoreCase("Plane")) {
			if (tier.equalsIgnoreCase("Coach")) {
				price = rand.nextInt(500) + 200;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}

			} else if (tier.equalsIgnoreCase("Business")) {

				price = rand.nextInt(400) + 800;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}

			else if (tier.equalsIgnoreCase("First Class")) {
				price = rand.nextInt(5800) + 1200;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}
		} else if (modeTrav.equalsIgnoreCase("train")) {
			if (tier.equalsIgnoreCase("Coach")) {
				price = rand.nextInt(200) + 100;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}

			} else if (tier.equalsIgnoreCase("Business")) {

				price = rand.nextInt(500) + 200;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}

			else if (tier.equalsIgnoreCase("First Class")) {
				price = rand.nextInt(900) + 600;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}

		} else if (modeTrav.equalsIgnoreCase("bus")) {
			if (tier.equalsIgnoreCase("Coach")) {
				price = rand.nextInt(150) + 50;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}

			} else if (tier.equalsIgnoreCase("Business")) {

				price = rand.nextInt(200) + 100;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}

			else if (tier.equalsIgnoreCase("First Class")) {
				price = rand.nextInt(300) + 400;
				if (name.equalsIgnoreCase("New York")) {
					price = price * .98;
				} else if (name.equalsIgnoreCase("Los Angeles")) {
					price = price;
				} else if (name.equalsIgnoreCase("New Orleans")) {
					price = price * 0.5;
				}
			}
		}
	}

	public Foreign(String cityname, String localtype, String localTier) {
		super(cityname, localtype, localTier);
		setProperties(cityname, localtype, localTier);

	}
}
