package Dz6_Calc;

import Dz6_Calc.Model.ResultModel;
import Dz6_Calc.View.GetValue;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new ResultModel(), new GetValue());
        p.buttonClick();
    }
}
