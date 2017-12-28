package work.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.food.dao.DeptMapper;
import work.food.entity.Dept;
import work.food.entity.DeptExample;
import work.food.entity.DeptExample.Criteria;
import work.food.entity.TreeNode;
import work.food.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper deptMapper;

	/* (non-Javadoc)
	 * @see work.food.service.impl.DeptService#queryFoodByFoodName(java.lang.Integer)
	 */
	public List<TreeNode> queryDept(Integer id) {
		if(id==null){
			id=0;
		}
		
		DeptExample example=new DeptExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(id);
		
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		List<Dept> list = deptMapper.selectByExample(example);
		for(Dept dept:list){
			TreeNode treeNode=new TreeNode();
			treeNode.setId(dept.getDeptno());
			treeNode.setText(dept.getDname());
			//判断该节点是否还存在子节点
			if(queryDept(dept.getDeptno()).size()==0){
				treeNode.setState("open");
			}
			nodes.add(treeNode);
		}
		return nodes;
	}

}
