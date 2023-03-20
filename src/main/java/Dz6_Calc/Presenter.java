package Dz6_Calc;

import Dz6_Calc.Model.I__Model;
import Dz6_Calc.View.GetOperation;
import Dz6_Calc.View.GetValue;

public class Presenter {
    GetValue value;
    GetOperation operation;
    I__Model model;



    public Presenter(I__Model m, GetValue v, GetOperation op) {
        model = m;
        value = v;
        operation = op;
    }

    public void buttonClick(){
        int a = value.getValue("a: ");
        int b = value.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int res = model.result();
        value.print(res, "результат операции: ");
    }
}
