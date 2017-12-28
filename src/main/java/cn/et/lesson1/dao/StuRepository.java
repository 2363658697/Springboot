package cn.et.lesson1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.et.lesson1.entity.Stu;


@Repository
public interface StuRepository extends CrudRepository<Stu, Integer> {

}
