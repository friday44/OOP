package Sem4_3;

public class Numeric<T extends Number> {
    T num;
    Numeric(T n) {
        num = n;
    }

    double recNum() {
        return  1 / num.doubleValue();
    }

    double fract() {
        return  num.doubleValue() - num.intValue();
    }

    boolean absEqual(Numeric<?> ob) {  // применение шаблона аргумента
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}
