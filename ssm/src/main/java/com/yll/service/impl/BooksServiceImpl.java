package com.yll.service.impl;


import com.yll.mapper.BooksMapper;
import com.yll.pojo.Books;
import com.yll.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *@Service、@Autowired（此时不需要set方法，只有xml配置才需要，注解方式不需要）等价于：
 *    <bean class="com.yll.service.impl.BooksServiceImpl" id="booksServiceImpl">
 *        <property name="booksMapper" ref="booksMapper"/>
 *    </bean>
 * */
//@Service("booksService")//指定BeanID
@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksMapper booksMapper;

	@Override
	public int addBook(Books books) {
		return booksMapper.addBook(books);
	}

	@Override
	public int deleteBookById(int id) {
		return booksMapper.deleteBookById(id);
	}

	@Override
	public int updateBook(Books books) {
		return booksMapper.updateBook(books);
	}

	@Override
	public Books queryBookById(int id) {
		return booksMapper.queryBookById(id);
	}

	@Override
	public List<Books> queryAllBook(String queryBookName) {
		return booksMapper.queryAllBook(queryBookName);
	}

}
