package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestParam("name") String name, @RequestParam("city") String city) {
		User user = null;
		try {
			user = new User(name, city);
			userDao.save(user);
		} catch (Exception ex) {
			return "error when creating the user - " + ex.toString();
		}
		return "user is created (id = " + user.getId() + ")";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam("id") long id) {
		try {
			User user = new User(id);
			userDao.delete(user);
		} catch (Exception ex) {
			return "error when deleting the user - " + ex.toString();
		}
		return "user is deleted (id = " + id + ")";
	}
}
