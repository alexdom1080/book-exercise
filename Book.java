/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Alexis Dominguez)
 * @version (2/4/2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int page;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        page = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    /**
     * Sets the reference number for the book for library use.
     */
    public void setRefNumber(String ref) {
        refNumber = ref;
    }
    
    /**
     * Provides access to the string holding the reference number.
     */
    public  String getRef() {
        return refNumber;
    }
    
    /**
     * Provides access to the string holding the author's name.
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Provides access to the string holding the book's title.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Provides access to the string holding the book's page number.
     */
    public int getPage() {
        return page;
    }
    
    /**
     * Prints out the author string.
     */
    public void printAuthor() {
        System.out.println(author);
    }
    
    /**
     * Prints out the title of the book.
     */
    public void printTitle() {
        System.out.println(title);
    }
    
    /**
     * Prints out the details of the book.
     */
    public void printDetails() {
        int length = refNumber.length();
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + page);
        if (length == 0) {
            System.out.println("ZZZ");
        }else {
            System.out.println("Reference Number: " + refNumber);
        }
    }
    
    
 }
    

