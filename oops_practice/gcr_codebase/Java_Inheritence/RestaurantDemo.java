package oops_practice.gcr_codebase.Java_Inheritence;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person
        implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name +
                " is preparing food.");
    }
}

class Waiter extends Person
        implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name +
                " is serving customers.");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {

        Chef chef =
                new Chef("Rahul", 1);

        Waiter waiter =
                new Waiter("Aman", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
