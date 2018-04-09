package org.ssh02.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.ssh02.pojo.Emp;
import org.ssh02.pojo.User;
import org.ssh02.service.EmpService;

@Controller
@CrossOrigin("*")
public class EmpController {

	@Resource
	private EmpService es;

	@RequestMapping("login")
	public String fn0(HttpSession session) {
		User user = new User();
		user.setUid(1);
		session.setAttribute("user", user);
		return null;
	}

	@RequestMapping("/abc")
	public String fn1() {
		String sql = "select * from emp";
		List<Emp> el = es.selectAll(sql, new Emp());
		System.out.println(el);
		return null;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String fn2(MultipartFile mfile) {
		System.out.println("ok");
		return null;
	}
}
