package Dz6_Calc;

import Dz6_Calc.Model.I__Model;
import Dz6_Calc.View.GetValue;

public class Presenter {
    GetValue view;
    I__Model model;

    public Presenter(I__Model m, GetValue v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "результат операции: ");
    }
}
