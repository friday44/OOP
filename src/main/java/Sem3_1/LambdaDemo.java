package Sem3_1;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNums myNum; // объявили ссылку на интерфейс
        myNum = () -> 98.6;  // простая лямда-функция, скобочки - это анонимный класс, стрелочка - это присваивание, если несколько параметров, то они записываются через запятую

        System.out.println("Постоянное значение " + myNum.getNum());

        MyParamNums myPNum = (n) -> 1.0 / n;
        System.out.println("Обратная величина 4 = " +myPNum.getNuns(4.0));
        System.out.println("Обратная величина 8 = " +myPNum.getNuns(8.0));
    }
}
