package Dz6_Calc.Model;

import Dz6_Calc.View.GetOperation;

public class ResultModel extends CalcModel {

    int op = new GetOperation().getOperation();
    
    @Override
    public int result() {
        int result = 0;
        
        switch (op){
            case 1: 
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                result = x / y;
                break;
            default:
                System.out.println("Операция не распознана");
        }
        return result;
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
