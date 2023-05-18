import java.util.Scanner;
public class zad17 {
    public static void main(String[] args){
        Scanner klawisz = new Scanner(System.in);
        double  posilek, podatek= 0.0675, napiwek= 0.2, x, y, z;
        System.out.print("Podaj cene dania: ");
        posilek = klawisz.nextInt();
        klawisz.nextLine();
        x= posilek * podatek;
        y= (x + posilek) * napiwek;
        z= x+y + posilek;
        System.out.println("Cena posilku to: " + posilek);
        System.out.println("Wysokość podatku to: " + x);
        System.out.println("Wysokość napiwku to: " + y);
        System.out.print("Łączna cena do zapłaty to: " + z);


    }
}
