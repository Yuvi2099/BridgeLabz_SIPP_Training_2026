package oops_practice.scenario_based_problems;

import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("Pair: " + first + " , " + second);
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class GenericDemo {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>("Age", 20);
        p.display();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();

        Integer[] arr = {12, 45, 7, 89, 23};
        System.out.println("Maximum: " + findMax(arr));

        Repository<Student> repo = new Repository<>();
        repo.add(new Student(101, "Vishal"));
        repo.add(new Student(102, "Aman"));

        System.out.println("Repository Data:");
        repo.display();

        List<String> names = Arrays.asList("Java", "Python", "C++");
        System.out.println("Wildcard List:");
        printList(names);
    }
}