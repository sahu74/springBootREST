package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourceService {

	private List<Course> list=null;

	public CourseServiceImpl() {
		super();
		list = new ArrayList<>();
		list.add(new Course(145,"Java Course", "This course is for Adv Java Ba Rest API"));
		list.add(new Course(200,"Core Java Course", "This course is for Core Java Ba Rest API"));
	}

	@Override
	public List<Course> getCources() {
		
		return list;
	}


	@Override
	public Course getCource(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if( course.getCourseId()== courseId)
			{
				c=course;
				break;
			}
		
		}
		return c;
	}



	@Override
	public Course addCourse(Course c) {
		
		list.add(c);
		return c;
	}






}
