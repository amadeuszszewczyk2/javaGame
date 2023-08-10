import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; // Losujemy liczbę od 1 do 100
        int attempts = 0;
        boolean hasGuessed = false;
        
        System.out.println("Witaj w grze Zgadnij Liczbę!");
        System.out.println("Zgadnij liczbę od 1 do 100.");
        
        while (!hasGuessed) {
            System.out.print("Podaj swoją propozycję: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Za mało! Spróbuj ponownie.");
            } else if (guess > randomNumber) {
                System.out.println("Za dużo! Spróbuj ponownie.");
            } else {
                hasGuessed = true;
                System.out.println("Gratulacje! Zgadłeś liczbę " + randomNumber + " po " + attempts + " próbach.");
            }
        }
        
        scanner.close();
    }
}
