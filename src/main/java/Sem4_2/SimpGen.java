package Sem4_2;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twOb = new TwoGen<>(88, "обобщение");

        twOb.showTypes();

        int val = twOb.getOb1();
        System.out.println("значение: " + val);

        String str = twOb.getOb2();
        System.out.println("значение: " + str);
     }
}
