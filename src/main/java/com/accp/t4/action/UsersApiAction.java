package com.accp.t4.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.exception.PersonException;
import com.accp.t4.vo.Users;

@RestController
@RequestMapping("/api/users")
public class UsersApiAction {

	private final List<Users> data = new ArrayList<Users>();
	{
		data.add(new Users(100, "admin", "123"));
		data.add(new Users(101, "sa", "456"));
		data.add(new Users(102, "test", "789"));
	}


	//默认访问
	@GetMapping
	public List<Users> queryUsersList() {
		return data;
	}
	
	//动态path
	@GetMapping("user/{userName}")
	public Users loadUsersInfo(@PathVariable String userName) {
		Users users = null;
		for (Users temp : data) {
			if (userName.equals(temp.getUserName())) {
				users = temp;
				break;
			}
		}
		if (users == null) {
			throw new PersonException("用户不存在");
		}
		return users;
	}

	@DeleteMapping("user/{userName}")
	public Map<String, String> removeUsersInfo(@PathVariable String userName) {
		System.out.println("移除" + userName + "用户");
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PostMapping("user")
	public Map<String, String> addUsersInfo(@RequestBody Users users) {
		System.out.println("新增用户:" + users.getUserId() + "\t" + users.getUserName() + "\t" + users.getUserPwd());
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@PutMapping("user")
	public Map<String, String> updateUsersInfo(@RequestBody Users users) {
		System.out.println("修改用户:" + users.getUserId() + "\t" + users.getUserName() + "\t" + users.getUserPwd());
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
	

	/*******************登陆业务***************/
	
	@GetMapping("user/{userName}/{userPwd}")
	public Map<String, String> loadUsersInfo(HttpSession session, @PathVariable String userName,
			@PathVariable String userPwd) {
		Map<String, String> message = new HashMap<String, String>();
		if (("admin".equals(userName) && "123".equals(userPwd)) || "sa".equals(userName) && "456".equals(userPwd)) {
			session.setAttribute("USERS", new Users(userName, userPwd));
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "300");
			message.put("msg", "login_error");
		}
		return message;
	}

	@GetMapping("user/session")
	public Users loadUsersBySession(HttpSession session) {
		return (Users) session.getAttribute("USERS");
	}
}
