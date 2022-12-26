package Sem3_3;

import java.util.Scanner;
import java.util.function.Supplier;

// interface Sapplier <T> {
//    T get();
// }

public class ProgUser {
    public static void main(String[] args) {
        Supplier <User> userFact = () -> { // начинается блок лямбда-выражения
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя ");
            String name = sc.nextLine();
            return new User(name);
        }; // точка с запятой закрывает блок лямбда-выражения
        User user1 = userFact.get();
        User user2 = userFact.get();

        System.out.println("имя user1: " + user1.getName());
        System.out.println("имя user2: " + user2.getName());
    }
}
