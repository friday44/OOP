package Dz2;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        var oksana = new Person("Оксана");
        var sergey = new Person("Сергей");
        var galina = new Person("Галина");
        var roza = new Person("Роза");
        var anatoliy = new Person("Анатолий");
        var mariya = new Person("Мария");
        var vasiliy = new Person("Василий");

        GeoTree gt = new GeoTree();
        gt.append(oksana, sergey);
        gt.append(oksana, galina);
        gt.append(galina, roza);
        gt.append(galina, anatoliy);
        gt.append(sergey, mariya);
        gt.append(sergey, vasiliy);

        System.out.println(
                new Research(gt).spend(galina, Relationship.parent));
    }
}

enum Relationship {
    parent,
    children
}

interface Human {
    String getFullName();
}

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

class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}

interface Tree {
    void append(Person parent, Person children);
    ArrayList<Node> getData();
}

class GeoTree implements Tree {
    private ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {

        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}

class Research {
    ArrayList<Node> tree;

    public Research(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<Person> spend(Human p, Relationship re) {
        var result = new ArrayList<Person>();

        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName()
                    && t.re == re) {
                result.add(t.p2);
            }
        }

        return result;
    }
}

class Printer {
    //
}

