package Dz2_2;

// демонстрация применения интерфейсной ссылки
public class Main_2 {
    public static void main(String[] args) {

        Ivanov h1 = new Ivanov();
        Ivanova h2 = new Ivanova();

        Human hi1;
        Human hi2;

        hi1 = h1;
        hi2 = h2;

        System.out.printf("%s %d %s\n", hi1.name(), hi1.age(), hi1.gender());
        System.out.printf("%s %d %s\n", hi2.name(), hi2.age(), hi2.gender());
    }
}
