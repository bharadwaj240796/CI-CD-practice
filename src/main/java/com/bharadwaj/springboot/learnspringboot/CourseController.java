package com.bharadwaj.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
 
	@RequestMapping("/courses")//("/courses") is a link, when it was clicked it displays all courses
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"learn AWS","Ranga"),
				new Course(2,"learn Spring Boot","Ranga"),
				new Course(3,"learn java script","Mosh"),
				new Course(4,"learn React","Mosh")
			);
		/*Here we add new dependency in pom.xml called devtool -> which is used to restart the web automatically.
		 * by this we are going to save the developer time*/
	}
}
