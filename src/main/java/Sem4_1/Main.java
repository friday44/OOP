package Sem4_1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int val = iOb.getOb();
        System.out.println("значение: " + val);

        Gen<String> strOb = new Gen<>("тестовое сообщение");
        strOb.showType();
        String text = strOb.getOb();
        System.out.println("значение: " + text);
    }
}
class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("тип Т - " + ob.getClass().getName());
    }
}