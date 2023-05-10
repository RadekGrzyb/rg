import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        int pudelko = 40,porcja=1,ciastko,kalorie=75,wynik;
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Wpisz liczbe zjedzonych ciastek: ");
        ciastko = klawisz.nextInt();
        klawisz.nextLine();
        wynik = ciastko*kalorie;
        System.out.println("Liczba zjedzonych ciastek: "+ciastko);
        System.out.println("Liczba zjedzonych kalorii: "+wynik);
    }
}

