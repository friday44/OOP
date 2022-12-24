package Dz1;

import java.util.ArrayList;

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