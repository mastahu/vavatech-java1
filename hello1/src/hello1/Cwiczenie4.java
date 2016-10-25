package hello1;
public class Cwiczenie4 {

    public static void main(String[] args) {
        int silniaZ5 = Silnia.silniaIteracyjnie(5);
        System.out.println(silniaZ5);
        silniaZ5 = Silnia.silniaRekurencyjnie(5);
        System.out.println(silniaZ5);
        int silniaZ6 = Silnia.silniaIteracyjnie(6);
        System.out.println(silniaZ6);
        silniaZ6 = Silnia.silniaRekurencyjnie(6);
        System.out.println(silniaZ6);
    }

}
