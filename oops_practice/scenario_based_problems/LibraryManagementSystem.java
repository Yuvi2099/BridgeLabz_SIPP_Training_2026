package oops_practice.scenario_based_problems;

import java.util.*;

interface Borrowable {
    void borrowBook();
    void returnBook();
}

interface Reservable {
    void reserveBook();
}

abstract class Book implements Borrowable, Reservable {
    protected int id;
    protected String title;
    protected String author;
    protected boolean available = true;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public abstract void displayDetails();

    @Override
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println(title + " returned successfully.");
    }

    @Override
    public void reserveBook() {
        System.out.println(title + " reserved.");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class PhysicalBook extends Book {
    private int shelfNo;

    public PhysicalBook(int id, String title, String author, int shelfNo) {
        super(id, title, author);
        this.shelfNo = shelfNo;
    }

    @Override
    public void displayDetails() {
        System.out.println("Physical Book -> ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Shelf: " + shelfNo);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(int id, String title, String author, double fileSize) {
        super(id, title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("EBook -> ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", File Size: " + fileSize + " MB");
    }
}

class Member {
    protected int memberId;
    protected String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}

class PremiumMember extends Member {
    private String membershipType;

    public PremiumMember(int memberId, String name, String membershipType) {
        super(memberId, name);
        this.membershipType = membershipType;
    }

    @Override
    public void displayMember() {
        System.out.println("Premium Member -> ID: " + memberId +
                ", Name: " + name +
                ", Type: " + membershipType);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.put(member.memberId, member);
    }

    public void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                book.displayDetails();
            }
        }
    }

    public void filterByAuthor(String author) {
        System.out.println("\nBooks by " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayDetails();
            }
        }
    }

    public void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        System.out.println("\nSorted Books:");
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public void displayAllBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public void displayMembers() {
        System.out.println("\nMembers:");
        for (Member member : members.values()) {
            member.displayMember();
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new PhysicalBook(1, "Java Programming", "James", 101));
        library.addBook(new PhysicalBook(2, "Data Structures", "Mark", 102));
        library.addBook(new EBook(3, "Python Basics", "James", 5.5));
        library.addBook(new EBook(4, "Algorithms", "Thomas", 8.2));

        library.addMember(new Member(1001, "Vishal"));
        library.addMember(new PremiumMember(1002, "Aman", "Gold"));

        library.displayAllBooks();
        library.displayMembers();

        library.searchBook("Java");
        library.filterByAuthor("James");
        library.sortBooksByTitle();

        System.out.println("\nBorrow/Reserve Demo:");
        Book b = new PhysicalBook(5, "Operating Systems", "Galvin", 103);

        b.displayDetails();
        b.borrowBook();
        b.reserveBook();
        b.returnBook();
    }
}