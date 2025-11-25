package mz.com.ngoca.repository;

import mz.com.ngoca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
