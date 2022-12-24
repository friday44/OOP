package Dz1;

class Person implements Human {
    private String fullName;

    public String getFullName() {

        return fullName;
    }

    public Person(String fullName) {

        this.fullName = fullName;
    }
    
    @Override
    public String toString() {

        return getFullName();
    }
}