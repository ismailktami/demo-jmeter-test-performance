package com.pluralsight.books.repository;

import com.pluralsight.books.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findAllByCategoryId(Integer id, Pageable pageable);
}
