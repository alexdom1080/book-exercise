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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
    
    public void printAuthor() {
        System.out.println(author);
    }
    
    public void printTitle() {
        System.out.println(title);
    }
 }
    

