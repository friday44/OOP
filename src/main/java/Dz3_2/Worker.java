package Dz3_2;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s %d %d", firstName, lastName, age, salary);
    }
}

