/**
* A phone makes calls
*/
public interface Phone {
/**
* Just print on the screen: "Calling <number>...".
*/
void call(String number);

void ringAlarm(String message);

void playGame(String nameOfGame);

void addToLastNumbers(String number);

void printLastNumbers();

void browseWeb(String address);

String findPosition();

String getBrand();

}