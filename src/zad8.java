import java.util.Scanner;
public class zad8 {
        public static void main(String[] args) {
            Scanner klawisz = new Scanner(System.in);
            int bok1,bok2,bok3;
            int pokoj1,pokoj2,pokoj3,pokoj4;
            double pole,os;

            System.out.println("Podaj pierwszy bok: ");
            bok1 = klawisz.nextInt();
            klawisz.nextLine();

            System.out.println("Podaj drugi bok: ");
            bok2 = klawisz.nextInt();
            klawisz.nextLine();

            System.out.println("Podaj trzeci bok: ");
            bok3 = klawisz.nextInt();
            klawisz.nextLine();
            pokoj1 = bok2*bok3;
            pokoj2 = bok2*bok3;
            pokoj3 = bok1*bok2;
            pokoj4 = bok1*bok1;
            pole = pokoj1+pokoj2+pokoj3+pokoj4;
            os = pole/4;
            System.out.println("Pokoje mają wymiary: " + pokoj1 + "," + pokoj2 + "," + pokoj3 + "," + pokoj4 + ",");
            System.out.println("Pole całkowite pomieszczeń: " + pole);
            System.out.println("przestrzeń przypadająca na jedną osobe: " + os);



        }
    }

