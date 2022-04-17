package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 10);
        Book warAndPeace = new Book("War and Peace", 500);
        Book stories = new Book("Stories", 225);
        Book favourites = new Book("Favourites", 600);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = stories;
        books[2] = warAndPeace;
        books[3] = favourites;
        for (Book bb : books) {
            System.out.println(bb.getName() + "," + bb.getPage());
        }
            Book tmp = books[0];
            books[0] = books[3];
            books[3] = tmp;
        for (Book bb : books) {
            System.out.println(bb.getName() + "," + bb.getPage());
        }
        for (Book bb : books) {
            if (bb.getName().equals("Clean code")) {
                System.out.println(bb.getName() + "," + bb.getPage());
            }
        }
    }
}
