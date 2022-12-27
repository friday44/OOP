package Dz3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgramWorker {
    public static void main(String[] args) {
        Random r = new Random();
        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("имя" + i, "фамилия" + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);

        db.sort(new AgeComporator());

        System.out.println(db);
    }
}
