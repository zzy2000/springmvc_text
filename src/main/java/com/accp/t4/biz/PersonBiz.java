package com.accp.t4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.t4.dao.IPersonDao;
import com.accp.t4.pojo.Person;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PersonBiz {

	@Autowired
	private IPersonDao personDao;

	public PageInfo<Person> findPersonListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Person>(personDao.queryPerson());
	}

	public List<Person> findPersonList() {
		return personDao.queryPerson();
	}

	public Person getPersonById(Integer pid) {
		return personDao.loadPerson(pid);
	}

	public void removePersonById(Integer pid) {
		personDao.deletePerson(pid);
	}

	public void modifyPerson(Person person) {
		personDao.deletePerson(person.getPid());
		personDao.savePerson(person);
		//personDao.updatePerson(person);
	}

	public void addPerson(Person person) {
		personDao.savePerson(person);
	}

}
