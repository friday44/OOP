package Sem2_1;

public class Program {
    public static void main(String[] args) {
        RealisationNums obj = new RealisationNums();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + obj.getNext());
        }
        System.out.println("Сброс");
        obj.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + obj.getNext());
        }
        System.out.println("Начальное значение 100");
        obj.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + obj.getNext());
        }
    }
}
