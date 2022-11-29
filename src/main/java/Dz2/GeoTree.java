package Dz2;

import java.util.ArrayList;

class GeoTree implements Tree {
    private ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {

        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILDREN, parent));
    }
}