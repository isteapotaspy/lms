/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CpE Laboratory BE216
 */
public class Book {

    public String title;
    public String author;
    public String description;
    public int ISBN;
    public int ID; // List<Genre>
    public LocalData publishedDate; // Localdate
    public float purchasePrice;
    public BookStatus availabilityStatus;
    public int copiesAvailable;
    
    private int bookId;
    private int borrowerHistory; //List<Borrower>
    private String catalog;
    private LocalDate lastreturned;
    
    public void borrow(Borrower borrower) {
        
    }
    
    public void returnBook() {
        
    }
    
    public void getBorrowerHistory(List<Borrower>BorrowerHistory) {
        
    }
    
    public void getCurrentBorrower() {
        
    }
}
