package Dz6_Calc.View;

import java.util.Scanner;

public class GetOperation {

    public int getOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите операцию:\n" +
                " 1 - сложение\n" +
                " 2 - вычитание\n" +
                " 3 - умножение\n" +
                " 4 - деление\n");

        return sc.nextInt();
    }
}
