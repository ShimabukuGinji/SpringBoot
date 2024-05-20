package com.example.lesson;

import com.example.lesson.entity.InsertProduct;
import com.example.lesson.entity.Product;
import com.example.lesson.service.IProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class LessonApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LessonApplication.class, args);
		var userService = context.getBean(IProductService.class);

		var list = userService.findAll();
		list.stream().forEach(System.out::println);

		var productFind = userService.findById(1);
		System.out.println(productFind);

		var productInsert = new InsertProduct("シャーペン", 200);
		var result1 = userService.insert(productInsert);
		System.out.println(result1);

		var productUpdate = new Product(5, "ボールペン", 500);
		var result2 = userService.update(productUpdate);
		System.out.println(result2);

		var result3 = userService.delete(5);
		System.out.println(result3);
	}
}