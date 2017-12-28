package cn.et.lesson2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.lesson1.entity.Stu;
import cn.et.lesson2.mapper.StuMapper;

@Repository
public class StuDaoImpl implements StuDao {
	@Autowired
	StuMapper stuMapper;
	
	/* (non-Javadoc)
	 * @see work.lesson2.dao.StuDao#queryOneStu(java.lang.Integer)
	 */
	@Override
	public Stu queryOneStu(Integer id) {
		Stu oneStu = stuMapper.queryOneStu(id);
		return oneStu;
	}
}
