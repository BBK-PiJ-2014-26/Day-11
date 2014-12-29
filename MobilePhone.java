public class MobilePhone extends OldPhone {

	/**
	 *  @param lastNumbers is a string array which stores the last 10 numbers which the user has called.
	 */
	private String[] lastNumbers = new String[]{"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"};

	/**
	* Constructor method.
	*/
	public MobilePhone(String brand) {
		super(brand);
	}

	/**
	 * Outputs a @param message specified by a user.
	 */
	public void ringAlarm(String message) {
		System.out.println("Alert: " + message);
	}

	/**
	 * Outputs a message telling a user the @param nameOfGame which they have chosen to play
	 */
	public void playGame(String nameOfGame) {
		System.out.println("You are playing " + nameOfGame + "...");
	}

	/**
	* This method maintains the list of last numbers called.
	*/
	public void addToLastNumbers(String number) {
		if (this.lastNumbers[0] == "empty") {
			this.lastNumbers[0] = number;
		} else if (this.lastNumbers[1] == "empty") {
			this.lastNumbers[1] = number;
		} else if (this.lastNumbers[2] == "empty") {
			this.lastNumbers[2] = number;
		} else if (this.lastNumbers[3] == "empty") {
			this.lastNumbers[3] = number;
		} else if (this.lastNumbers[4] == "empty") {
			this.lastNumbers[4] = number;
		} else if (this.lastNumbers[5] == "empty") {
			this.lastNumbers[5] = number;
		} else if (this.lastNumbers[6] == "empty") {
			this.lastNumbers[6] = number;
		} else if (this.lastNumbers[7] == "empty") {
			this.lastNumbers[7] = number;
		} else if (this.lastNumbers[8] == "empty") {
			this.lastNumbers[8] = number;
		} else if (this.lastNumbers[9] == "empty") {
			this.lastNumbers[9] = number;
		} else {

			this.lastNumbers[0] = this.lastNumbers[1];
			this.lastNumbers[1] = this.lastNumbers[2];
			this.lastNumbers[2] = this.lastNumbers[3];
			this.lastNumbers[3] = this.lastNumbers[4];
			this.lastNumbers[4] = this.lastNumbers[5];
			this.lastNumbers[5] = this.lastNumbers[6];
			this.lastNumbers[6] = this.lastNumbers[7];
			this.lastNumbers[7] = this.lastNumbers[8];
			this.lastNumbers[8] = this.lastNumbers[9];
			this.lastNumbers[9] = number;
		}
	}

	/**
	*  This method prints the lastNumbers list
	*/
	public void printLastNumbers() {
		System.out.println("Called: " + this.lastNumbers[9]);
		System.out.println("Called: " + this.lastNumbers[8]);
		System.out.println("Called: " + this.lastNumbers[7]);
		System.out.println("Called: " + this.lastNumbers[6]);
		System.out.println("Called: " + this.lastNumbers[5]);
		System.out.println("Called: " + this.lastNumbers[4]);
		System.out.println("Called: " + this.lastNumbers[3]);
		System.out.println("Called: " + this.lastNumbers[2]);
		System.out.println("Called: " + this.lastNumbers[1]);
		System.out.println("Called: " + this.lastNumbers[0]);
	}

}