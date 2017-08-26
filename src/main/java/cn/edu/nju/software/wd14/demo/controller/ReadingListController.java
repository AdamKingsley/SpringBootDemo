package cn.edu.nju.software.wd14.demo.controller;

import cn.edu.nju.software.wd14.demo.dao.ReadingListRepository;
import cn.edu.nju.software.wd14.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepository readingListRepository;

    //自动注入
    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @GetMapping("/{reader}")
    public String readersBooks(@PathVariable String reader,Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (reader != null){
            model.addAttribute("books",readingList);
        }
        return "readingList";
    }

    @GetMapping
    public String readersBooks(){
        return "readingList";
    }

    @PostMapping("/{reader}")
    public String addToReadingList(@PathVariable String reader,Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }

}
