import java.util.Scanner;

public class zadatak1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Unos broja n
        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();
        
        // Ispis brojeva djeljivih sa sumom cifara
        System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i <= n; i++) {
            if (djeljivSaSumomCifara(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    // Pomoćna funkcija za izračunavanje sume cifara cijelog broja
    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }
    
    // Funkcija koja provjerava je li broj djeljiv sa sumom svojih cifara
    public static boolean djeljivSaSumomCifara(int broj) {
        int suma = sumaCifara(broj);
        return (broj % suma == 0);
    }
}
