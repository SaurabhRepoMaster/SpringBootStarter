package com.demo.demoProject.services;

import com.demo.demoProject.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Component -- we can use this or service to make spring boot understand that this class object will be used
//so it will make this class ready for autowired
@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(1,"Java","Saurabh"));
        list.add(new Book(2,"Python","Saurabh"));
        list.add(new Book(3,"C","Saurabh"));
    }

    //returns all books
    public List<Book> getAllBooks()
    {
        return list;
    }

    public Book getByBookId(int id){
        Book b = null;
        //this try catch is required here bcz if id is not present then this list code will give exception.
        try{list.stream().filter(e->e.getBookId()==id).findFirst().get();}
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;

    }

    public Book addBook(Book b)
    {
        list.add(b);
        return b;
    }

    public void deleteBook(int id)
    {
        //creating a new book list by removing the earlier one and reassigning to the list.
       list = list.stream().filter(e->e.getBookId()!=id).collect(Collectors.toList());
    }

    public void upateBook(Book b, int id)
    {
      list =   list.stream().map(e->{
            if(e.getBookId()==id)
            {
                e.setBookAuthor(b.getBookAuthor());
                e.setBookName(b.getBookName());
            }
            return e;
        }).collect(Collectors.toList());
    }
}
