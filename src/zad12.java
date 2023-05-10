import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int km, litr, kml;

        System.out.println("Ile przejechales km: ");
        km = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Ile litrow paliwa spaliles: ");
        litr = klawisz.nextInt();
        klawisz.nextLine();

        kml= km/litr;
        System.out.print("Kilometry przejechane na litr paliwa: " + kml);
    }
}
