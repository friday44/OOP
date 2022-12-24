package Dz2_4;

public interface Human {
    String name();
    int age();
    String gender();
    default String species() {
        return "человек разумный";
    }
    static String structure() {
        return "голова, 2 руки, 2 ноги";
    }
}
