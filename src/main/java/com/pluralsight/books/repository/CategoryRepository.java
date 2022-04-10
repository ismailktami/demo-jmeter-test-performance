package com.pluralsight.books.repository;

import com.pluralsight.books.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
