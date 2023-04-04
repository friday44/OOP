//Реализуем метод добавления новых элементов в начало списка
//и удаление первого элемента связного списка.

//1.Реализуем метод поиска элемента в односвязном списке для проверки наличия элемента внутри списка.
//2.Для корректной работы со связным список необходимо понимать, как именно
// можно обходить все значения внутри связного списка.
// 3.Для нашего примера проще всего будет написать метод поиска значения в
// связном списке и возвращения из метода информации о наличии искомого внутри списка

// Необходимо реализовать метод разворота односвязного списка

package Lists;

class MyList {
    Node head;

    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.appendFirst("First value"); //добавление одного элемента в голову
        ml.appendFirst("Second value"); //добавление одного элемента в голову
        ml.appendFirst("Third value"); //добавление одного элемента в голову
        ml.deleteFirst(); //удаление одного элемента из головы
        Node temp = ml.head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

        System.out.println(ml.contains("First value"));
        System.out.println(ml.contains("Tenth value"));
    }

    public void appendFirst(String value) {
        Node n = new Node();
        n.value = value;
        if (head == null) {
            head = n;
        }
        else {
            n.next = head;
            head = n;
        }
    }

    public void deleteFirst() {
        if(head != null) {
            head = head.next;
        }
    }

    public boolean contains (String text) {
        if(head != null) {
            Node temp = head;
            while(temp != null) {
                if(text.equals(temp.value)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public void revert() {
        if(head != null && head.next != null) { // исключаем разворот для списка меньше 2х элементов
            revert(head.next, head); // запускаем со второго элемента списка
        }
    }
    private void revert(Node temp, Node previousNode) {
        if (temp.next == null) {
            head = temp;
        } else {
            revert(temp.next, temp); // рекурсивно обходим список до последнего элемента
        }
        temp.next = previousNode;
        previousNode.next = null; // т.к. рекурсия начинается со второго элемента списка, предыдущий (первый) не меняется
    }

    class Node {
        Node next; // ссылка на следующий элемент списка
        String value;
    }
}
class Node {
    Node next;
    String value;
}