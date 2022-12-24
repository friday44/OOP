package Dz2_1;

public class Ivanov implements Human {

    @Override
    public String name() {
        return "Ivan";
    }

    @Override
    public int age() {
        return 25;
    }

    @Override
    public String gender() {
        return "male";
    }

    public void newMethod() {
        System.out.println("информация");
    }
}
