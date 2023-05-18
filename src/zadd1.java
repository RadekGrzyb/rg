import java.util.Scanner;
public class zadd1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe od 1 do 10: ");
        int wartosc = scanner.nextInt();
        switch (wartosc) {
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
            case 10:
                System.out.print("X");
                break;
            default:
                System.out.print("Błąd");
                break;
        }
    }
}