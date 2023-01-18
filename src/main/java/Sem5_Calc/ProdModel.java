package Sem5_Calc;

public class ProdModel extends CalcModel {

    public ProdModel() {

    }
    // do_it
    @Override
    public int result() {
        return x * y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
