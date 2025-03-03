import java.util.Scanner;

public class Book {
    String title;
    String author;
 
        public Book(String title){
            this.title = title;
            this.author= author;

        }
        public Book(String title,String author){
            this.title = title;
            this.author= author;

        }
        public  void display(){
            System.out.println("title is "+ title);
            if (author != null) {
            System.out.println("Author: " + author);
        } 
            System.out.println("title is "+ title + " Author "+ author);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter book1 title ");
            String title1 = sc.nextLine();
            
            Book book1 = new Book(title1);
           

            System.out.println("Enter Book2 title ");
            String title2 = sc.nextLine();
            System.out.println("Enter author name ");
            String author = sc.nextLine();

            Book book2 = new Book(title2, author );

            book1.display();
            book2.display();
        }

    
    
}
