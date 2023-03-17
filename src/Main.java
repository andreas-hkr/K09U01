import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dagens mätarställning? 5673
        // Mätarställning för ett år sedan? 4114
        // Antal liter förbrukad bensin? 1325
        // Antal körda mil:        1559
        // Förbrukning per mil:    0,85

        Scanner input = new Scanner(System.in);
        System.out.print("Dagens mätarställning? ");
        int now = input.nextInt();
        System.out.print("Mätarställning för ett år sedan? ");
        int then = input.nextInt();
        System.out.print("Antal liter förbrukad bensin? ");
        double amount = input.nextDouble();

        int total = now - then;
        System.out.format("Antal körda mil:%12d%n", total);
        System.out.format("Förbrukning per mil:%,8.2f%n", amount/total);
    }
}