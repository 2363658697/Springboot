package work.food.service;

import work.food.entity.Emp;
import work.food.entity.EmpExample;
import work.food.utils.PageTools;

public interface EmpService {

	public abstract int getEmpCount(EmpExample example);

	public abstract PageTools queryEmpByEname(String ename, Integer page,
			Integer rows,Integer deptno);

	public abstract void saveEmp(Emp emp);

	public abstract void updateEmp(Emp emp);

	public abstract void deleteEmp(String empno);

}