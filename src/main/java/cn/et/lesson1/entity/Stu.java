package cn.et.lesson1.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 表结构    id(主键，自增)    sname(varchar类型)
 * @author Administrator
 *
 */


@Entity
public class Stu {
	@Id
	// 指定是主键
	@GeneratedValue(strategy = GenerationType.AUTO)
	// 指定主键生成的策略
	private int id;
	@Column
	// 如果实体类的属性名和表中的列名不一致 @Column(name="表中的列名")
	private String sname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
