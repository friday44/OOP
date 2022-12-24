package Sem2_2;

public class RealisationNums implements Nums22 {

    int start;
    int val;
    int prev;

    public RealisationNums() {
        start = 0;
        val = 0;
        prev = -2;
    }
    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

}
