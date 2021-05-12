package com.example.Springwithmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Springwithmongodb.model.Book;

// MongoRepository<Primarykey and its DataType>
public interface BookRepository extends MongoRepository<Book, Integer> {
	
}
