package cn.et.lesson2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson1.entity.Stu;
import cn.et.lesson2.service.StuService;



@RestController
public class StuController {

	@Autowired
	StuService service;

	@RequestMapping("/query/{id}")
	public Stu queryOneStu(@PathVariable Integer id) {
		Stu oneStu = service.queryOneStu(id);
		return oneStu;
	}

}
