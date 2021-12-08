package com.dyscode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dyscode.entity.User;
import com.dyscode.repository.UserRepository;
import com.dyscode.vo.Book;
import com.dyscode.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public User findByUserId(Long userId) {
		return repository.findById(userId).get();
	}

	public ResponseTemplateVO finUsersWithBookByUserId(Long userId) {
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		User user = findByUserId(userId);
		responseTemplateVO.setUser(user);
		Book book = restTemplate.getForObject("http://BOOK-MICROSERVICES/books/"+user.getBookId(), Book.class);
		responseTemplateVO.setBook(book);
		return responseTemplateVO;
	}
	
	
}
