// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class Task2 {
    public static void enqueue(LinkedList<String> list, String value) {
        list.add(value);
    }

    public static Object dequeue(LinkedList<String> list) {
        return list.removeFirst();
    }

    public static Object first(LinkedList<String> list) {
        return list.getFirst();
    }
}