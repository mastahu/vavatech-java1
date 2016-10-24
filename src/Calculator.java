import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę:");
//        Scanner scanner = new Scanner(System.in);
//        int liczba1 = scanner.nextInt();
//
//        String operacja = scanner.next();
//
//        int liczba2 = scanner.nextInt();


        testuj(2, "+", 2, 4);
        testuj(2, "-", 2, 0);
        testuj(3, "*", 5, 15);
        testuj(3, "/", 2, 1);
        testuj(3, "%", 2, 1);
        testuj(11, "%", 5, 1);
        testuj(20, "%", 5, 0);
    }

    private static void testuj(int liczba1, String operacja, int liczba2, int spodziewanyWynik) {
        int wynik = policz(liczba1, liczba2, operacja);
        if (spodziewanyWynik != wynik) {
            System.out.println("UWAGA BŁĄD!");
        }
        System.out.println("liczba1: " + liczba1 +
                " liczba2: " + liczba2 +
                " operacja: " + operacja +
                " spodziewany wynik: " + spodziewanyWynik +
                " prawdziwy wynik: " + wynik);


    }


    private static int policz(int liczba1, int liczba2, String operacja) {
        if (operacja.equals("+")) {
            return liczba1 + liczba2;
        }

        if (operacja.equals("/")) {
            return liczba1 / liczba2;
        }

        if (operacja.equals("*")) {
            return liczba1 * liczba2;
        }

        if (operacja.equals("-")) {
            return liczba1 - liczba2;
        }

        if (operacja.equals("%")) {
            return liczba1 % liczba2;
        }

        return -1;
    }
}
