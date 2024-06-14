package Program100;

import java.util.ArrayList;
import java.util.List;

public class P7Book {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        //creating the books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        System.out.println(b1);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        System.out.println(b2);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        System.out.println(b3);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for (Book b:
             list) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+ b.quantity);
        }

    }
}