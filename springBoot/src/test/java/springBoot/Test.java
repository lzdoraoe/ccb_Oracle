package springBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springBoot.bean.User;
import springBoot.service.UserService;

@Controller
@EnableAutoConfiguration
public class Test {
	@Autowired
	private UserService UserService;
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World";
	}
	@RequestMapping("/jdbc/getUsers")
	@ResponseBody
	List<User> getAllUsers() {
		return UserService.getUserList();		
	}
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}
}
