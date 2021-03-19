package com.springrest.springrest.entities;

public class Course {
	private long courseId;
	private String title;
	private String desc;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Course(long courseId, String title, String desc) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.desc = desc;
	}
	public Course() {
		super();
		
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", desc=" + desc + ", getCourseId()="
				+ getCourseId() + ", getTitle()=" + getTitle() + ", getDesc()=" + getDesc() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
