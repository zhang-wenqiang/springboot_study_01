package com.example.springboot_study_01.Controller;

import com.example.springboot_study_01.Dao.BookMapper2;
import com.example.springboot_study_01.Entity.Book;
import com.example.springboot_study_01.Service.BookService;
import com.example.springboot_study_01.Service.BookService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.ResourceUrlProviderExposingInterceptor;

import java.sql.Wrapper;
import java.util.List;

/*
 *   时间：2021/5/17
 *
 *
 */
@Controller
@RequestMapping(value="/book",method = {RequestMethod.GET,RequestMethod.POST})
public class BookController {
    @Autowired
    BookService bookService = new BookService();
    @Autowired
    private BookService2 bookService2;
    @Autowired
    private BookMapper2 bookMapper2;
    @RequestMapping("/listone")
    @ResponseBody
    public Book listOne(int bookid){
        return bookService.findBook(bookid);
    }
    @RequestMapping("/listall")
    @ResponseBody
    public List<Book> listAll(){
        return bookService.listBook();
    }
    @RequestMapping(value="/add")
    @ResponseBody
    public String add(int bookid,String bookname,String bookauthor,String bookconcern,String bookprice,String bookamount){
        Book book = new Book(bookid,bookname,bookauthor,bookconcern,bookprice,bookamount);
        int result = bookService.insertBook(book);
        if(result>0){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }
    @PostMapping("/addskip")
    public String addbookskip(){
        return "addbook";
    }
    @RequestMapping(value = "updateskip")
    @ResponseBody
    public ModelAndView updateskip(int bookid){
        Book book = bookService.findBook(bookid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updatebook");
        modelAndView.addObject("bookone",book);
        return modelAndView;
    }
    @RequestMapping(value = "/update")
    @ResponseBody
    public String update(int bookid,String bookname,String bookauthor,String bookconcern,String bookprice,String bookamount){
        Book book = new Book(bookid,bookname,bookauthor,bookconcern,bookprice,bookamount);
        System.out.println(book);
        int check = bookService.updatebook(book);
        if(check>=0)
        return "修改成功";
        else
            return "修改失败";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(int bookid){
        int result = bookService.deleteBook(bookid);
        if(result>=1){
            return "删除成功";
        }
        else{
            return "删除失败";
        }
    }
    @PostMapping("/selectall")
    @ResponseBody
    public ModelAndView selectall(){

        List<Book> bookList = bookService.listBook();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main2");
        modelAndView.addObject("booklist",bookList);
        return modelAndView;
    }
}
