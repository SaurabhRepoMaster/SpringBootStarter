package com.demo.demoProject.controllers;

import com.demo.demoProject.model.Book;
import com.demo.demoProject.model.BookEntity;
import com.demo.demoProject.repo.BookRepository;
import com.demo.demoProject.services.BookService;
import com.demo.demoProject.services.BookServiceUsingDb;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@Controller  -- we are not using it here since we are making RestController.
@RestController
public class BookController1 {

//    @Autowired
//    private BookServiceUsingDb bookServiceUsingDb;
//
//    //@ResponseBody -- not required with RestController
//    //@ResponseBody -- not required with RestController
//    //@RequestMapping(value="/books",method = RequestMethod.GET)  -- can be replaced like below
////    @GetMapping("/books")
////    //Note: here jacksopn dependency gets triggered which is auto added module when we add rest dependecy
////    //and this jackson dependency converts object into JSON
////    public List<Book> getBooks(){
////        //This will return only 1 book...so here we are going to create a fake service i.e. db and return that value to return all
////        //books
//////        Book b1 = new Book();
//////        b1.setBookAuthor("Saurabh");
//////        b1.setBookName("Java API");
//////        b1.setBookId(1);
////       // return b1;
////        return this.bookService.getAllBooks();
////    }
//
//    @GetMapping("/books")
//    public ResponseEntity<List<BookEntity>> getBooks(){
//        List<BookEntity> book= this.bookServiceUsingDb.getAllBooks();
//        if(book==null || book.size()<=0)
//        {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.of(Optional.of(book));
//    }
//
//    //Normal code without responseentity ..so default status code of 200 in postman even if record is not found.
////    @GetMapping("/books/{id}")
////    public Book getBook(@PathVariable("id") int id)
////    {
////        return this.bookService.getByBookId(id);
////    }
//
//    @GetMapping("/books/{id}")
//    public ResponseEntity<BookEntity> getBook(@PathVariable("id") int id)
//    {
//        BookEntity b = this.bookServiceUsingDb.getByBookId(id);
//        if(b==null)
//        {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.of(Optional.of(b));
//    }
//
//    //    @PostMapping("/books")
////    public Book addBook(@RequestBody Book book )
////    {
////        return this.bookService.addBook(book);
////    }
//    @PostMapping("/books")
//    public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity book )
//    {
//        BookEntity b = null;
//        try {
//            b=this.bookServiceUsingDb.addBook(book);
//            return ResponseEntity.status(HttpStatus.CREATED).body(b);
//        }catch(Exception e )
//        {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    //    @DeleteMapping("/books/{id}")
////    public void deleteBook(@PathVariable("id") int id)
////    {
////         this.bookService.deleteBook(id);
////    }
//    @DeleteMapping("/books/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable("id") int id)
//    {
//        try {
//            this.bookServiceUsingDb.deleteBook(id);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//    @PutMapping("/books/{id}")
//    public ResponseEntity<BookEntity> updateBook(@RequestBody BookEntity b, @PathVariable("id") int id)
//    {
//        BookEntity book = null;
//        try {
//            this.bookServiceUsingDb.upateBook(b, id);
//            return ResponseEntity.ok().body(b);
//        }catch(Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//

}
