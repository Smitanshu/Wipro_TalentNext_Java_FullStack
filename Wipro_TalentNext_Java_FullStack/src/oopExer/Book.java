package oopExer;
class Author {
    private String name;
    private String email;
    private char gender;

    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

  
    public void printAllDetails() {
        System.out.println("Author   :" + name);
        System.out.println("Email    :" + email);
        System.out.println("Gender   :" + gender);
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

   
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) { 
        this.qtyInStock = qtyInStock;
    }

    
    public void printAllDetails() {
        System.out.println("!--All Details of Book--!");
        System.out.println("Book     :" + name);
        System.out.println("Price    :" + price);
        System.out.println("Quantity :" + qtyInStock);
     
        author.printAllDetails();
    }

    public static  void main(String[] args) {
        Author author = new Author("J.K Rowling", "jk@123", 'F');
        Book book = new Book("Harry Potter", author, 35, 100);
        
     
        book.printAllDetails();
    }
}
