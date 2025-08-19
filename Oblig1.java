import java.util.Scanner;
public class Oblig1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("skriv inn fornavnet ditt: ");

        String Fnavn = scanner.nextLine();

        System.out.print("Fint, nå skriv etternavnet ditt: ");
        String Enavn = scanner.nextLine();

        String Fulltnavn = Fnavn + " " + Enavn;

        System.out.println("Tenk at jeg, " + Fulltnavn + ", har naila oblig 1 allerede!");


    }
}
