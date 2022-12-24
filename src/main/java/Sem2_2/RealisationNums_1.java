package Sem2_2;

public class RealisationNums_1 implements Nums22 {

    int start;
    int val;

    public RealisationNums_1() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 20;
        return val;
    }
}
