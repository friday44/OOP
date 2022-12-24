package Sem2_3;

public class RealNums implements Nums23 {

    int start;
    int val;
    int prev;

    RealNums() {
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

    public void print_1() {
        System.out.println("Новый метод");
    }

}

