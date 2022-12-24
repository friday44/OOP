package Sem2_2;

public class Program {
    public static void main(String[] args) {
        RealisationNums obj = new RealisationNums();
        RealisationNums_1 obj_1 = new RealisationNums_1();
        //Nums obi; // интерфейсная ссылка, позволяет применять только методы объявленные в интерфейсе

        for (int i = 0; i < 5; i++) {
            //obi = obj;
            System.out.println("Следующее значение: " + obj.getNext());
        }

        for (int i = 0; i < 5; i++) {
            //obi = obj;
            System.out.println("Следующее значение: " + obj_1.getNext());
        }
        //obj.print_1();
    }
}