import java.util.Scanner;

public class zad14 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int egz1, egz2, egz3, srednia;

        System.out.println("Podaj wynik pierwszego egzaminu: ");
        egz1 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj wynik drugiego egzaminu: ");
        egz2 = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj wynik trzeciego egzaminu: ");
        egz3 = klawisz.nextInt();
        klawisz.nextLine();

        srednia = (egz1+egz2+egz3)/3;

        System.out.println("Wynik pierwszego egzaminu: " + egz1 + "%");
        System.out.println("Wynik drugiego egzaminu: " + egz2 + "%");
        System.out.println("Wynik trzeciego egzaminu: " + egz3 + "%");
        System.out.println("Srednia egzaminow: " + srednia + "%");


    }
}
