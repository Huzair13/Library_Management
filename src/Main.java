public class Main {
    public static void main(String[] args){

        //LibraryItem
        LibraryItem libraryItem=new LibraryItem(20,"JAVA",2020);
        System.out.println(libraryItem.title);
        libraryItem.LibraryItemMethod();

        //Book
        Book book=new Book(30,"DSA",2023,"Sethu");
        System.out.println(book.title);
        book.BookMethod();
        book.BookMethod(10);

        //Getter and Setter for Book class
        book.setAuthor("Huzair");
        System.out.println(book.getAuthor()+"\n");

        //Magazine
        Magazine magazine=new Magazine(21,"Joy of Programming",2023,5);
        System.out.println(magazine.title);
        magazine.MagazineMethod();

        //Getter and Setter for Magazine method
        magazine.setMagazine(8);
        System.out.println(magazine.getMagazine()+"\n");
    }
}

class LibraryItem{

    private int id;
    String title;
    int year;

    //Getter for year
    public int getId(){
        return year;
    }

    //Setter for year
    public void setId(int year){
        this.year=year;
    }

    //CONSTRUCTOR FOR LIBRARY ITEM
    LibraryItem(int id, String title, int year){
        this.id=id;
        this.title=title;
        this.year=year;
    }

    public void LibraryItemMethod(){
        System.out.println("ID : "+this.id+"\nTitle : "+this.title+"\nYear : "+this.year+"\n");
    }

}

class Book extends LibraryItem{
    private String author;

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    //CONSTRUCTOR FOR BOOK CLASS WITH SUPER METHOD WHICH IS CALLING PARENT CONSTRUCTOR
    Book(int id, String title, int year,String author) {
        super(id, title, year);
        this.author=author;
    }

    public void BookMethod(){
        System.out.println("No Arguments BookMethod");
        System.out.println("ID : "+getId()+"\nTitle : "+this.title+"\nYear : "+this.year+"\nAuthor : "+getAuthor()+"\n");
        setId(12);
        System.out.println("\n"+"After Setting the year using setter method");
        System.out.println("ID : "+getId()+"\nTitle : "+this.title+"\nYear : "+this.year+"\nAuthor : "+getAuthor()+"\n");
    }

    public void BookMethod(int numbers){
        System.out.println("BookMethod with Arguments");
        System.out.println("ID : "+getId()+"\nTitle : "+this.title+"\nYear : "+this.year+"\nAuthor : "+getAuthor()+"\nNumber of Books : "+numbers+"\n");
    }
}

class Magazine extends LibraryItem{
    private int issue;

    public int getMagazine(){
        return issue;
    }

    public void setMagazine(int issue){
        this.issue=issue;
    }
    Magazine(int id, String title, int year,int issue) {
        super(id, title, year);
        this.issue=issue;
    }

    public void MagazineMethod(){
        System.out.println("ID : "+getId()+"\nTitle : "+this.title+"\nYear : "+this.year+"\nIssue : "+getMagazine()+"\n");
    }

}