package com.action;
import java.net.URLDecoder;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;

@Controller
@RequestMapping("/user")
public class Action {
@RequestMapping("/name")
	public String test(String username,String method){
		System.out.println("username:"+username);
		System.out.println("method:"+method);
		return "success";

}
@RequestMapping("/test")
public String test(User user){
	System.out.println("username:"+user.getUsername());
	System.out.println("date:"+user.getDate());
	
	return "success";
}
/*@ModelAttribute//该方法会先执行
public User testModelAttribute(String username){//该属性要存在于表单name
	User user=new User();
	user.setUserid(10);
	user.setUsername("小明");
	user.setDate(new Date());
	System.out.println("modelAttribute");
	return user;
}*/
}
