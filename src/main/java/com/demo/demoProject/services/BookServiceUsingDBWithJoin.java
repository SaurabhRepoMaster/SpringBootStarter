package com.demo.demoProject.services;

import com.demo.demoProject.model.BookEntity;
import com.demo.demoProject.model.BookEntityWithAuthor;
import com.demo.demoProject.repo.BookEntityWithAuthorRepository;
import com.demo.demoProject.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookServiceUsingDBWithJoin {
    @Autowired
    private BookEntityWithAuthorRepository bookEntityWithAuthorRepository;

    public List<BookEntityWithAuthor> getAllBooks()
    {
        List<BookEntityWithAuthor> book = bookEntityWithAuthorRepository.findAll();
        return book;
    }

    public BookEntityWithAuthor getByBookId(int id){
        BookEntityWithAuthor b = null;
        //this try catch is required here bcz if id is not present then this list code will give exception.
        try{
            b=  bookEntityWithAuthorRepository.findById(id).get();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;

    }

    public BookEntityWithAuthor addBook(BookEntityWithAuthor b)
    {
        bookEntityWithAuthorRepository.save(b);
        return b;
    }

    public void deleteBook(int id)
    {
        //creating a new book list by removing the earlier one and reassigning to the list.
        bookEntityWithAuthorRepository.deleteById(id);
    }

    public void upateBook(BookEntityWithAuthor b, int id)
    {
        b.setBookId(id);
        bookEntityWithAuthorRepository.save(b);
    }
}
