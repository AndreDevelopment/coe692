/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab2;

import java.util.ArrayList;

/**
 *
 * @author student
 */
class UserInfo {
    /*to be completed
    For now, we just add book info to make the example work. This class must be completed in future
    */
    private ArrayList <BookBorrowed> bookborrowed = new ArrayList<>();
    public void addBook(BookBorrowed book){
        bookborrowed.add(book);
    }
    public ArrayList<BookBorrowed> getBookBorrowed(){
        return bookborrowed;
    }
    
}
