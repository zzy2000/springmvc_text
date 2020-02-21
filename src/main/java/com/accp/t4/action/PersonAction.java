package com.accp.t4.action;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.biz.PersonBiz;
import com.accp.t4.pojo.Person;
import com.alibaba.fastjson.JSONPObject;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/persons")
public class PersonAction {

	@Autowired
	private PersonBiz personBiz;

	@GetMapping
	public List<Person> getPersonList() {
		return personBiz.findPersonList();
	}

	@GetMapping("{num}/{size}")
	public PageInfo<Person> getPersonListByPage(@PathVariable Integer num, @PathVariable Integer size) {
		return personBiz.findPersonListByPage(num, size);
	}

	@DeleteMapping("person/{pid}")
	public Map<String, String> delPersonInfo(@PathVariable Integer pid) {
		Map<String, String> message = new HashMap<String, String>();
		personBiz.removePersonById(pid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping("person/{pid}")
	public Person getPersonInfo(@PathVariable Integer pid) {
		return personBiz.getPersonById(pid);
	}

	@PutMapping("person")
	public Map<String, String> updatePersonInfo(@RequestBody Person person) {
		Map<String, String> message = new HashMap<String, String>();
		personBiz.modifyPerson(person);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PostMapping("person")
	public Map<String, String> addPersonInfo(@RequestBody Person person) {
		Map<String, String> message = new HashMap<String, String>();
		personBiz.addPerson(person);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping(value = "{num}/{size}/jsonp")
	public JSONPObject getPersonListByPageToJSONP(@PathVariable Integer num, @PathVariable Integer size)
			throws Exception {
		// 跨域函数名称
		JSONPObject jsonp = new JSONPObject("callback");// 非常重要。对应jquery中jsonpCallback设置
		// 追加json数据
		// callback({})
		jsonp.addParameter(personBiz.findPersonListByPage(num, size));
		return jsonp;
	}

}
