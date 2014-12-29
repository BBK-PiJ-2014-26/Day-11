import java.util.Scanner;

public class PhoneLauncher {
	private SmartPhone myPhone;

	public PhoneLauncher() {
		this.myPhone = new SmartPhone("nokia");
	}

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		System.out.println("\n" + "Please select an operation. \n" + "1 to call.\n" + "2 to display the last 10 numbers called.\n" + "3 to browse the web.\n" + "4 for your GPS position.\n" + "5 to initiate an alarm.\n" + "6 to play a game.\n" + "7 to display brand.\n" + "8 to quit.\n");
		Scanner sc = new Scanner(System.in);
		boolean finished = false;
		if (sc.hasNextInt()) {
			int choice = sc.nextInt();
			if (choice == 1) {
					System.out.print("Enter a phone number: ");
					sc = new Scanner(System.in);
					String number = sc.next();
					this.myPhone.call(number);
					this.myPhone.addToLastNumbers(number);
					this.launch();

			} else if (choice == 2) {
					this.myPhone.printLastNumbers();
					this.launch();

			} else if (choice == 3) {
					System.out.print("Enter a web address: ");
					sc = new Scanner(System.in);
					String address = sc.next();
					this.myPhone.browseWeb(address);
					this.launch();

			} else if (choice == 4) {
					System.out.println("Your position is: " + this.myPhone.findPosition());
					this.launch();

			} else if (choice == 5) {
					System.out.print("Enter your alarm message: ");
					sc = new Scanner(System.in);
					String message = sc.next();
					this.myPhone.ringAlarm(message);
					this.launch();

			} else if (choice == 6) {
					System.out.print("Enter the name of the game: ");
					sc = new Scanner(System.in);
					String nameOfGame = sc.next();
					this.myPhone.playGame(nameOfGame);
					this.launch();

			} else if (choice == 7) {
					System.out.print(this.myPhone.getBrand() + "\n");
					this.launch();

			} else if (choice == 8) {
					System.out.print("Goodbye.\n");

			} else {
					System.out.print("Invalid option. Please try again.");
					this.launch();

			}
		} else {
			System.out.print("Invalid option. Please try again.");
			this.launch();
		}

	}
}