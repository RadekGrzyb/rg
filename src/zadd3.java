import java.util.Scanner;

public class zadd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoją wage: ");
        int waga = scanner.nextInt();
        System.out.print("Podaj swoj wzrost: ");
        double wzrost = scanner.nextDouble();
        double BMI;
        BMI = waga / (wzrost * 2);
        System.out.println("Twoje BMI to: " + BMI);

        if (BMI > 18.5) {
            System.out.print("Masz niedowage.");
        }
        else if (BMI >= 18.5 && BMI <= 25)
        {
            System.out.print("Twoja waga jest prawidłowa");
        }
    }
}

