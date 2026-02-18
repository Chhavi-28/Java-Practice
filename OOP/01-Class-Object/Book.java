class Book{
    String title;
    String author;
    float price;
    Book (String title , String author, float  price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayBookDetails(){
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99f);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99f);
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 9.99f);
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();
        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
        System.out.println("\nBook 3 Details:");
        book3.displayBookDetails();
        float total = book1.price + book2.price + book3.price;
        System.out.println("\nTotal Price of all Books :"+total);
    }

}
