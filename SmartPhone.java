public class SmartPhone extends MobilePhone {

	/**
	* Constructor method.
	*/
	public SmartPhone(String brand) {
		super(brand);
	}

	/**
	* Prints a mesage telling a user that they have opened the specified web address.
	*/
	public void browseWeb(String address) {
		System.out.println("Opening web page: " + address + "...");
	}

	/**
	* Returns fictious GPS co-ordinates.
	*/
	public String findPosition() {
		double x = 12.265;
		double y = 98.756;
		String result = x + "N, " + y + "E";
		return result;
	}

	/**
	* Override call() method to defer 00 numbers via the internet.
	*/
	@Override
	public void call(String number) {
		String s = number.substring(0, 2);
		if (s.equals("00")) {
			System.out.println("Calling <" + number + "> through the internet to save money...");
		} else {
			super.call(number);
		}
	}

}