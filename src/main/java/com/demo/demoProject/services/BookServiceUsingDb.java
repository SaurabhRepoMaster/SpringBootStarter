package com.demo.demoProject.services;

import com.demo.demoProject.model.Book;
import com.demo.demoProject.model.BookEntity;
import com.demo.demoProject.repo.BookRepository;
import com.demo.demoProject.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookServiceUsingDb {

    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> getAllBooks()
    {
        List<BookEntity> book = bookRepository.findAll();
        return book;
    }

    public BookEntity getByBookId(int id){
        BookEntity b = null;
        //this try catch is required here bcz if id is not present then this list code will give exception.
        try{
          b=  bookRepository.findById(id).get();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;

    }

    public BookEntity addBook(BookEntity b)
    {
        bookRepository.save(b);
        return b;
    }

    public void deleteBook(int id)
    {
        //creating a new book list by removing the earlier one and reassigning to the list.
        bookRepository.deleteById(id);
    }

    public void upateBook(BookEntity b, int id)
    {
        b.setBookId(id);
        bookRepository.save(b);
    }
}
