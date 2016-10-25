import java.math.BigDecimal;

public class Cwiczenie8 {

    public static void main(String[] args) {
        float f = 1.0000001F; float g = f;
        System.out.println(g == f);
        g += 1; g -= 1;
        System.out.println(g == f);
        System.out.println(f);
        System.out.println(g);

        double d  = 0.2 + 0.2 + 0.2 + 0.2 + 0.2;
        System.out.println(d);
        double d2  = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d2);

        BigDecimal d3 = new BigDecimal("0.1");

        d3 = d3.add(d3).add(d3).add(d3).add(d3).add(d3).add(d3).add(d3).add(d3).add(d3);
        System.out.println(d3);
    }
}
