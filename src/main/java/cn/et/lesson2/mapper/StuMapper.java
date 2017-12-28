package cn.et.lesson2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.et.lesson1.entity.Stu;

@Mapper
public interface StuMapper {
		
	@Select("select * from stu where id=#{0}")
	public Stu queryOneStu(Integer id);
}
