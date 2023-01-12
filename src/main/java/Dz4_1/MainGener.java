package Dz4_1;

public class MainGener {
    public static void main(String[] args) {
        Gener<Integer> iOb;
        iOb = new Gener<Integer>(100);
        iOb.showType();
        Integer val = iOb.getOb();
        System.out.println("значение: " + val);

        Gener<Double> dOb;
        dOb = new Gener<Double>(100.0);
        dOb.showType();
        Double valum = dOb.getOb();
        System.out.println("значение: " + valum);

        Gener<String> strOb = new Gener<>("текст");
        strOb.showType();
        String text = strOb.getOb();
        System.out.println("значение: " + text);
    }
}
class Gener<T> {
    T ob;
    Gener(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("тип Т: " + ob.getClass().getName());
    }
}
