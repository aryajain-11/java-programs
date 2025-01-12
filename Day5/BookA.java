public class BookA {
    public static void main(String[] args) {
        BookA obj = new BookA();
        obj.printDetails();
        obj.applyDiscount();
    }
    String title  ;
    String author ;
    int ISBN ;
    int price ;
    String publisher ;

    public BookA(){
        title = "Atomic Habits" ;
        author = "ABC";
        ISBN = 123;
        price = 60;
        publisher = " Random ";
    }
    
    public void applyDiscount(){
        System.out.println("discount is applicable");
    }
    
    public  void printDetails(){
        System.out.println("Book title  is " + title );
        System.out.println("author is " + author );
        System.out.println("ISBN is " + ISBN );
        System.out.println("Pice is " +  price  );
        System.out.println("publisher is " +publisher);
    }   
}

