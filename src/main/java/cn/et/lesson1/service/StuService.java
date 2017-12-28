package cn.et.lesson1.service;

import cn.et.lesson1.entity.Stu;

public interface StuService {

	public abstract String saveStu();

	public abstract String updateStu();
	
	public abstract String deleteStu();
	
	public abstract Stu queryStu();
}