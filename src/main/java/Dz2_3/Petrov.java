package Dz2_3;

public class Petrov implements Person{
    @Override
    public String name() {
        return "Petr";
    }

    @Override
    public int age() {
        return 34;
    }

    @Override
    public String gender() {
        return "male";
    }

    @Override
    public String status() {
        return "unmarried";
    }
}
