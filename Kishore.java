//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//class Book {
//    private int bookId;
//    private String bookName;
//    private String authorName;
//    private double bookPrice;
//
//    public Book(int bookId, String bookName, String authorName, double bookPrice) {
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.authorName = authorName;
//        this.bookPrice = bookPrice;
//    }
//
//    public void display_content() {
//        System.out.println("Book ID: " + bookId);
//        System.out.println("Book Name: " + bookName);
//        System.out.println("Author Name: " + authorName);
//        System.out.println("Book Price: $" + bookPrice);
//    }
//}
//
//public class Kishore {
///*
//    public static void main(String[] args) {
//        Scanner ac = new Scanner(System.in);
//        int count = ac.nextInt();
//        ArrayList<Character> a=new ArrayList();
//        System.out.println("Enter the ID for the count");
//        for(int i=0;i<count;i++){
//            char id=ac.next().charAt(0);
//            a.add(id);
//        }
//        for (char sd:a) {
//            System.out.println("Enter the details for the count");
//            int b_i = ac.nextInt();
//            String b_n = ac.next();
//            String a_n = ac.next();
//            double b_p = ac.nextDouble();
//            Book value = new Book(b_i, b_n, a_n, b_p);
//            value.display_content();
//        }
//    }
//*/
//
//    public static void main(String[] args){
//        boolean b=true;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the count");
//        int count=sc.nextInt();
//        ArrayList<String > s=new ArrayList<String>();
//        for(int i=0;i<count;i++){
//            String m="student_"+(i);
//            int b_i = sc.nextInt();
//            String b_n = sc.next();
//            String a_n = sc.next();
//            double b_p = sc.nextDouble();
//            Book m = new Book(b_i, b_n, a_n, b_p);
//            s.add(m.toString());
//        }
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private double bookPrice;

    public Book(int bookId, String bookName, String authorName, double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}

public class Kishore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();
        ArrayList<Book> books = new ArrayList<Book>();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            int bookId = sc.nextInt();
            String bookName = sc.next();
            String authorName = sc.next();
            double bookPrice = sc.nextDouble();
            Book book = new Book(bookId, bookName, authorName, bookPrice);
            books.add(book);
        }

        sc.close();

        System.out.println("Books entered:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
