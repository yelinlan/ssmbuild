package com.yll.controller;

import com.yll.pojo.Books;
import com.yll.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {

	//@Qualifier("booksService")
	@Autowired//默认加载 booksServiceImpl 按BooksService类型注入，找到容器的booksServiceImpl
	private BooksService booksService;

	@RequestMapping("/login")
	public String login(HttpServletRequest req) {
		req.getSession().setAttribute("token","login");
		req.setAttribute("msg","注册成功！可以登陆");
		return "forward:/index.jsp";
	}

	@RequestMapping("/toAddBook")
	public String toAddBook() {
		return "/jsp/addBook";
	}

	@PostMapping("/addBook")
	public String addBook(Books books) {
		booksService.addBook(books);
		return "forward:/book/queryAllBook";
	}

	@RequestMapping("/deleteBookById/{id}")
	public String deleteBookById(@PathVariable("id") int id) {
		booksService.deleteBookById(id);
		return "forward:/book/queryAllBook";
	}

	@RequestMapping("/toUpdate")
	public String toAddBook(@RequestParam("id") int id, Model model) {
		Books Qbook = booksService.queryBookById(id);
		model.addAttribute("Qbook", Qbook);
		return "/jsp/updateBook";
	}

	@PostMapping("/updateBook")
	public String updateBook(Books books) {
		booksService.updateBook(books);
		return "forward:/book/queryAllBook";
	}

	@RequestMapping("/queryAllBook")
	public String queryAllBook(String queryBookName, Model model) {
		List<Books> booksList = booksService.queryAllBook(queryBookName);
		model.addAttribute("list", booksList);
		return "jsp/allBook";
	}


}