/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab2;

import java.util.Date;

/**
 *
 * @author student
 */
public class BookBorrowed {

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private  boolean available;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date date) {
        this.dueDate = date;
    }
    String bookName;
    String bookAuthor;
    Date dueDate;

    /*
    To be completed
     */
    public BookBorrowed(String bookName, String bookAuthor, Date borrowStartTime, boolean available) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.dueDate = borrowStartTime;
        this.available=available;
    }

    
}
