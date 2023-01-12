package Dz4_2;

public class MainMyNun {
    public static void main(String[] args) {
        MyNun<Integer> intOb = new MyNun<>(5);
        System.out.println("обратная величина intOb: " + intOb.recNum());
        System.out.println("дробная часть intOb: " + intOb.fract());
        System.out.println("дополнение до 100: " + intOb.add100Num());

        MyNun<Double> dOb = new MyNun<>(5.25);
        System.out.println("обратная величина dOb: " + dOb.recNum());
        System.out.println("дробная часть dOb: " + dOb.fract());
        System.out.println("дополнение до 100: " + dOb.add100Num());
    }
}
