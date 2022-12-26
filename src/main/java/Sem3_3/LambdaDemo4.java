package Sem3_3;

//interface  BinaryOperator<T, T> {
//    T apply (Tn, Tn);
//}

import java.util.function.BinaryOperator;

public class LambdaDemo4 {
    public static void main(String[] args) {
        BinaryOperator<Integer> bop = (x, y) -> x * y;
        System.out.println(bop.apply(3, 5));
        System.out.println(bop.apply(4, 12));
    }
}
