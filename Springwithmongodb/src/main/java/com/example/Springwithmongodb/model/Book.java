package com.example.Springwithmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// we need to annotate 'Document' because we are using the NoSQL DB mongoDb
@Document(collection="Book")
public class Book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	
	public int getId() {
		return id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
