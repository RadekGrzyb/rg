import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        double marza=0.4,zysk,cenad;

        System.out.println("Podaj cene detaliczna: ");
        cenad = klawisz.nextInt();
        klawisz.nextLine();
        zysk = cenad*marza;
        System.out.println("Zysk : "+zysk);
    }
}

