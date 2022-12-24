package Dz1;

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
                new Research(gt).spend(galina, Relationship.PARENT));
    }
}








