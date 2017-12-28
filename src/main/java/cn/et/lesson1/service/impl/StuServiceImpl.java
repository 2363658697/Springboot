package cn.et.lesson1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson1.dao.StuRepository;
import cn.et.lesson1.entity.Stu;
import cn.et.lesson1.service.StuService;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	StuRepository stuRepository;


	public String saveStu(){
		Stu stu=new Stu();
		stu.setSname("gggg");
		stuRepository.save(stu);
		return "ok";
	}
	
	public String updateStu(){
		Stu stu=new Stu();
		stu.setId(8);
		stu.setSname("666");
		stuRepository.save(stu);
		return "ok";
	}
	
	public String deleteStu(){
		stuRepository.delete(13);
		return "ok";
	}
	
	public Stu queryStu(){
		Stu findOne = stuRepository.findOne(8);
		return findOne;
	}
	
}
