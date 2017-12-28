package work.food.service;

import java.util.List;

import work.food.entity.TreeNode;

public interface DeptService {


	public abstract List<TreeNode> queryDept(Integer id);

}