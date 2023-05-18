import java.util.Scanner;

public class zadd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzien jako liczbe: ");
        int x=scanner.nextInt();
        System.out.print("Podaj miesac jako liczbe: ");
        int y=scanner.nextInt();
        System.out.print("Podaj dwie ostatnie liczby roku: ");
        int z=scanner.nextInt();
        if (x*y == z){
            System.out.print("Data jest magiczna");
        }
        else{
            System.out.print("Data nie jest magiczna");
        }
    }
}
