package com.yll.mapper;


import com.yll.pojo.Books;

import java.util.List;

public interface BooksMapper {

	//增如一本书
	int addBook(Books books);

	//删除一本书
	int deleteBookById(int id);

	//更新一本书
	int updateBook(Books books);

	//查询一本书
	Books queryBookById(int id);

	//查询全部的书
	List<Books> queryAllBook(String queryBookName);

}
