package Sem3_1.Sem4_1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("значение: " + v);

        Gen<String> strOb = new Gen<>("сообщение");
        strOb.showType();
        String temp = strOb.getOb();
        System.out.println("значение: " + temp);
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
        System.out.println("тип: " + ob.getClass().getName());
    }
}
