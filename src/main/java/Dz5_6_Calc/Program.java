package Dz5_6_Calc;

public class Program {
    public static void main(String[] args) {
        GetInt a = new GetInt();
        GetOperation op = new GetOperation();
        Calc c = new Calc();

        int num1 = a.getInt();
        int num2 = a.getInt();
        char operation = op.getOperation();
        int result = c.calc(num1,num2,operation);

        System.out.println("Результат операции: " + result);
    }
}

//public class Program {
//    public static void main(String[] args) {
//        int num1 = getInt();
//        int num2 = getInt();
//        char operation = getOperation();
//        int result = calc(num1,num2,operation);
//        System.out.println("Результат операции: "+result);
//    }
//
//    public static int getInt(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int num;
//        if(scanner.hasNextInt()){
//            num = scanner.nextInt();
//        } else {
//            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            scanner.next();//рекурсия
//            num = getInt();
//        }
//        return num;
//    }
//
//    public static char getOperation(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите операцию:");
//        char operation;
//        if(scanner.hasNext()){
//            operation = scanner.next().charAt(0);
//        } else {
//            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
//            scanner.next();//рекурсия
//            operation = getOperation();
//        }
//        return operation;
//    }
//
//    public static int calc(int num1, int num2, char operation){
//        int result;
//        switch (operation){
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                result = num1 / num2;
//                break;
//            default:
//                System.out.println("Операция не распознана. Повторите ввод.");
//                result = calc(num1, num2, getOperation());//рекурсия
//        }
//        return result;
//    }
//}
