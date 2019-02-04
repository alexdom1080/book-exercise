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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        page = bookPages;
    }

    // Add the methods here ...
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
    
 }
    

