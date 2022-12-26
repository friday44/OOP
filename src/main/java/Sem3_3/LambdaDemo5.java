package Sem3_3;
// interface Function<T, R> {
//     R apply (T m);
// }
import java.util.function.Function;

public class LambdaDemo5 {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(300));
    }
}
