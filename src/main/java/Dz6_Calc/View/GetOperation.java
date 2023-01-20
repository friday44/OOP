package Dz6_Calc.View;

import java.util.Scanner;

public class GetOperation {

    Scanner sc = new Scanner(System.in);

    public int getOperation() {

        System.out.print("Выберите операцию:\n" +
                " 1 - сложение\n" +
                " 2 - вычитание\n" +
                " 3 - умножение\n" +
                " 4 - деление\n");

        return sc.nextInt();
    }
}
