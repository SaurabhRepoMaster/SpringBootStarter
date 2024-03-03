package com.demo.demoProject.repo;

import com.demo.demoProject.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}
