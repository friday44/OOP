package Sem4_3;

public class Demo {
    public static void main(String[] args) {
//        Numeric<Integer> intOb = new Numeric<>(5);
//        System.out.println("обратная величина intOb: " + intOb.recNum());
//        System.out.println("дробная часть intOb: " + intOb.fract());
//
//        Numeric<Double> dOb = new Numeric<>(5.25);
//        System.out.println("обратная величина dOb: " + dOb.recNum());
//        System.out.println("дробная часть dOb: " + dOb.fract());

        Numeric<Integer> intOb = new Numeric<>(6);
        Numeric<Double> dOb = new Numeric<>(-6.0);
        Numeric<Long> lOb = new Numeric<>(5L);
        System.out.println("сравнение intOb и dOb: ");
        if (intOb.absEqual(dOb)) {
            System.out.println("абсолютные значения совпадают");
        } else {
            System.out.println("абсолютные значения отличаются");
        }

        System.out.println("сравнение intOb и lOb: ");
        if (intOb.absEqual(lOb)) {
            System.out.println("абсолютные значения совпадают");
        } else {
            System.out.println("абсолютные значения отличаются");
        }
    }
}
