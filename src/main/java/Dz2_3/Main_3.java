package Dz2_3;

// демонстрация наследования интефейса от интерфейса
public class Main_3 {
    public static void main(String[] args) {
        Petrov petr = new Petrov();

        System.out.printf("%s %d %s %s\n", petr.name(), petr.age(), petr.gender(), petr.status());
    }
}
