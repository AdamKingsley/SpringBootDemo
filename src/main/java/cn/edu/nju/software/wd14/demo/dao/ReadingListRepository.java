package cn.edu.nju.software.wd14.demo.dao;

import cn.edu.nju.software.wd14.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
