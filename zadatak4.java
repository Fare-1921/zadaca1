import java.util.Scanner;

public class zadatak4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Unesite 5 brojeva:");

        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Unesite broj #" + i + ": ");
            double broj = scanner.nextDouble();
            suma += broj;
        }

        
        System.out.println("Suma unesenih brojeva je: " + suma);

        scanner.close();
    }
}
