import java.util.Scanner;

public class zadatak2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Unos stringa od korisnika
        System.out.print("Unesite string: ");
        String userInput = scanner.nextLine();

        // Ispis broja karaktera u stringu
        int brojKaraktera = prebrojKaraktere(userInput);
        System.out.println("Broj karaktera u unesenom stringu je: " + brojKaraktera);

        scanner.close();
    }

    // Pomoćna funkcija za prebrojavanje karaktera u stringu
    public static int prebrojKaraktere(String str) {
        return str.length();
    }
}

