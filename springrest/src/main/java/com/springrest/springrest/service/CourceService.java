package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourceService {
	public List<Course> getCources();
	public Course getCource(long courseId);
	public Course addCourse(Course c);

}
