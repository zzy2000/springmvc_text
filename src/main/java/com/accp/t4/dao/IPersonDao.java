package com.accp.t4.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.t4.pojo.Person;

public interface IPersonDao {

	/**
	 * 
	 * @title: queryPerson
	 * @description:查询全部数据
	 * @return
	 */
	public List<Person> queryPerson();

	/**
	 * 
	 * @title: deletePerson
	 * @description: 删除
	 * @param pid
	 * @return
	 */
	public int deletePerson(@Param("pid") Integer pid);

	/**
	 * 
	 * @title: loadPerson
	 * @description: 读取
	 * @param pid
	 * @return
	 */
	public Person loadPerson(@Param("pid") Integer pid);

	/**
	 * 
	 * @title: updatePerson
	 * @description: 更新
	 * @param person
	 */
	public int updatePerson(@Param("person") Person person);
	
	
	/**
	 * 
	 * @title: savePerson
	 * @description: 新增
	 * @param person
	 */
	public int savePerson(@Param("person") Person person);

}
