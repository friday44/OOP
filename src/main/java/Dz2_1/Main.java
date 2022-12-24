package Dz2_1;
// демонстрация наследования интерфейса в двух классах,
// использования дополнительного метода в одном из классов

public class Main {
    public static void main(String[] args) {

        Ivanov h1 = new Ivanov();
        Ivanova h2 = new Ivanova();

        System.out.printf("%s %d %s\n", h1.name(), h1.age(), h1.gender());
        System.out.printf("%s %d %s\n", h2.name(), h2.age(), h2.gender());

        h1.newMethod();
    }

}
