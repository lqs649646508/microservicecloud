package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *	导入org.projectlombok包下lombok-1.16.18.jar之后
 *			@NoArgsConstructor ：生成类的无参构造器
 *			@AllArgsConstructor :生成类的全参构造器
 *			@Data				:生成类属性的get/set方法
 *			@Accessors(chain=true) :允许对类对象进行链式操作
 */
@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}

}
