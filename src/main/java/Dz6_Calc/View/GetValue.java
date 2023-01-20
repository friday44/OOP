package Dz6_Calc.View;

import java.util.Scanner;

public class GetValue {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
