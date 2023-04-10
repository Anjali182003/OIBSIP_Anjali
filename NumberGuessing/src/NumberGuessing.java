import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessing {
  public static void main(String[] args) {
    Random random = new Random();
    int range = 100; // change as needed
    int secretNumber = random.nextInt(range) + 1;
    int maxAttempts = 10; // change as needed
    int score = 0;
    int attempts = 0;

    while (attempts < maxAttempts) {
      String input = JOptionPane.showInputDialog("Guess the number (1-" + range + ")");
      int guess = Integer.parseInt(input);

      if (guess == secretNumber) {
        score += maxAttempts - attempts;
        JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + (attempts + 1) + " attempts.\nYour score is " + score + ".");
        break;
      } else if (guess < secretNumber) {
        JOptionPane.showMessageDialog(null, "Too low! Try again.");
      } else {
        JOptionPane.showMessageDialog(null, "Too high! Try again.");
      }

      attempts++;
    }

    if (attempts == maxAttempts) {
      JOptionPane.showMessageDialog(null, "Sorry, you didn't guess the number in " + maxAttempts + " attempts.\nThe secret number was " + secretNumber + ".");
    }
  }
}
