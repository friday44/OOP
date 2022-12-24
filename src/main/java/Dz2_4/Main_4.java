package Dz2_4;

// демонстрация использование метода интерфейса по умолчанию
// демонстрация использования статического метода
public class Main_4 {
    public static void main(String[] args) {
        Ivanov ivan = new Ivanov();

        String hum = Human.structure();

        System.out.printf("%s %d %s %s\n", ivan.name(), ivan.age(), ivan.gender(), ivan.species());
        System.out.println(hum);

    }
}
