package cn.et.lesson1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson1.entity.Stu;
import cn.et.lesson1.service.StuService;

//该注解继承了Contrller,ResponseBody注解
@RestController
public class StuController {

	@Autowired
	StuService service;

	@RequestMapping("/saveStu")
	public String saveStu() {
		String saveStu = service.saveStu();
		return saveStu;
	}

	@RequestMapping("/updateStu")
	public String updateStu() {
		String updateStu = service.updateStu();
		return updateStu;
	}

	@RequestMapping("/deleteStu")
	public String deleteStu() {
		String deleteStu = service.deleteStu();
		return deleteStu;
	}

	@RequestMapping("/queryStu")
	public Stu queryStu() {
		Stu queryStu = service.queryStu();
		return queryStu;
	}

}

/**
 * springboot 扫描的范围是启动类所在包以及子包 注解加在实现类上不加在接口上，映射路径不能重复（不同包中的类上的映射都不能重复）
 */
