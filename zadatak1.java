import java.util.Scanner;

public class zadatak1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();
        
        
        System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i <= n; i++) {
            if (djeljivSaSumomCifara(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    
    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }
    
    
    public static boolean djeljivSaSumomCifara(int broj) {
        int suma = sumaCifara(broj);
        return (broj % suma == 0);
    }
}
