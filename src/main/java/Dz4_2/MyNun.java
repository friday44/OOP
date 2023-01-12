package Dz4_2;

public class MyNun<T extends Number> {
    T num;
    MyNun(T n) {
        num = n;
    }

    double recNum() {
        return  1 / num.doubleValue();
    }

    double fract() {
        return  num.doubleValue() - num.intValue();
    }

    double add100Num() {
        return  100 - num.doubleValue();
    }
}
