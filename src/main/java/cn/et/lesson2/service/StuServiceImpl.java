package cn.et.lesson2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson1.entity.Stu;
import cn.et.lesson2.dao.StuDao;

@Service
public class StuServiceImpl implements StuService {
	
	@Autowired
	StuDao stuDao;
	
	/* (non-Javadoc)
	 * @see work.lesson2.service.StuService#queryOneStu(java.lang.Integer)
	 */
	@Override
	public Stu queryOneStu(Integer id){
		Stu oneStu = stuDao.queryOneStu(id);
		return oneStu;
	}

}
