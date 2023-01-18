package Sem5_Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p1 = new Presenter(new SumModel(), new View());
        Presenter p2 = new Presenter(new DiffModel(), new View());
        Presenter p3 = new Presenter(new ProdModel(), new View());
        Presenter p4 = new Presenter(new QuotModel(), new View());
        p1.buttonClick();
        p2.buttonClick();
        p3.buttonClick();
        p4.buttonClick();
    }
}
