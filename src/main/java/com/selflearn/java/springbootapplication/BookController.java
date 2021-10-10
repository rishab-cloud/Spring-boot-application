package com.selflearn.java.springbootapplication;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList( new Book(1L, "Mastering SpringBoot" ,"Rishabkuamar"),
				new Book(2L, "Mastering SpringBoot-REST-api" ,"Rishabkuamar"));
	}

}
