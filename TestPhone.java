public class TestPhone {

	public static void testPhone(Phone myPhone) {
		myPhone.call("01245 412544");
		myPhone.ringAlarm("boo");
		myPhone.playGame("Tetris");
		myPhone.addToLastNumbers("014225");
		myPhone.printLastNumbers();
		myPhone.browseWeb("www...");
		String s1 = myPhone.findPosition();
		String s2 = myPhone.getBrand();
	}
}