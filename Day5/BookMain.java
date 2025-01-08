
public class BookMain {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.print();  
    }
}
    class Book{
        String title;
        String name;
        int ISBN;
        // create constructor and print detaisl
        public Book() {
            title = " Habits";
            name = "Atomic Habits";
            ISBN = 123;
    }
    void print(){
        System.out.println("Book title is " + title);
        System.out.println("Book name is " + name  );
        System.out.println("Book ISBN is " + ISBN);
    }
 }

