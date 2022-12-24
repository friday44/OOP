package Sem2_3;

public class Program {
    public static void main(String[] args) {
        RealNums obj = new RealNums();
        RealNums_1 obj_1 = new RealNums_1();
        Nums23 obi; // интерфейсная ссылка, позволяет применять только методы объявленные в интерфейсе

        for (int i = 0; i < 5; i++) {
            obi = obj;
            System.out.println("Следующее значение: " + obi.getNext());
        }

        for (int i = 0; i < 5; i++) {
            obi = obj_1;
            System.out.println("Следующее значение: " + obi.getNext());
        }

        obj.print_1();
    }
}
