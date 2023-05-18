import java.util.Scanner;

public class zadd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wynik z egzaminu: ");
        double egz1 = scanner.nextDouble();
        System.out.print("Podaj wynik z drugiego egzaminu : ");
        double egz2 = scanner.nextDouble();
        System.out.print("Podaj wynik z trzeciego egzaminu: ");
        double egz3 = scanner.nextDouble();
        double wynik;
        wynik = (egz1 + egz2 + egz3)/3;
        System.out.println("Wynik z egzaminów to: " + wynik);

        if (wynik>=90){
            System.out.print("Twoja ocena to: 5");
        }
        else if (wynik>=80 && wynik<=89){
            System.out.print("Twoja ocena to: 4");
        }
        else if (wynik>=70 && wynik<=79){
            System.out.print("Twoja ocena to: 3");
        }
        else if (wynik>=60 && wynik<=69) {
            System.out.print("Twoja ocena to: 2");
        }
            else if (wynik < 60){
                System.out.print("Twoja ocena to: 1");
            }
        }
    }

