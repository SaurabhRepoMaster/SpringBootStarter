package com.demo.demoProject.repo;

import com.demo.demoProject.model.BookEntityWithAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookEntityWithAuthorRepository extends JpaRepository<BookEntityWithAuthor,Integer> {
}
