package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourceService;

@RestController
public class myController {
	
	@Autowired
	private CourceService service;
	
	@GetMapping("/home")
	public String home()
	{
		return "This is from MyController";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.service.getCources();
		
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourses(@PathVariable String courseId)
	{
		return this.service.getCource(Long.parseLong(courseId));
		
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course c)
	{
		return this.service.addCourse(c);
		
	}
	
	
}
