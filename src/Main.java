import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Иванов");
        list.add("Петров");
        list.add("Сидоров");
        list.add("Козлов");

        System.out.println("Исходный список: " + list);
        LinkedList<String> reversedList = Task.reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);

        Task2.enqueue(list, "Тенякова");
        System.out.println(list);
        System.out.println(Task2.dequeue(list));
        System.out.println(list);
        System.out.println(Task2.first(list));
        System.out.println(list);
    }
}