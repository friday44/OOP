package Sem2_3;

public class RealNums_1 implements Nums23 {

    int start;
    int val;

    RealNums_1() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 20;
        return val;
    }
}