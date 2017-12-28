package work.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import work.food.entity.TreeNode;
import work.food.service.DeptService;



@Controller
public class DeptController {

	@Autowired
	DeptService deptService;

	@ResponseBody
	@RequestMapping("/dept")
	public List<TreeNode> queryFoodList(Integer id){
		
		List<TreeNode> dept = deptService.queryDept(id);
		
		return dept;
	}


}
