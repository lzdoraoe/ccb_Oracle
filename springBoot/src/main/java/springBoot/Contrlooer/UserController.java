package springBoot.Contrlooer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springBoot.bean.JsonResult;
import springBoot.bean.User;
import springBoot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request) {
		String uName=request.getParameter("uName");
		String uPassword=request.getParameter("uPassword");
		String uPassword2=request.getParameter("uPassword2");
		if (uPassword.equals(uPassword2)) {
			User user=new User(uName, uPassword);
			userService.addUser(user);
		}
		return null;
		
	}
	
	 @RequestMapping("/")
	    public String index(ModelMap map) {
	        // 加入一个属性，用来在模板中读取
	        map.addAttribute("host", "http://blog.didispace.com");
	        // return模板文件的名称，对应src/main/resources/templates/index.html
	        return "index";  
	    }
	 @RequestMapping("/index2")
	    public ModelAndView  index2() {
		 ModelAndView mvAndView=new ModelAndView("index");
		 mvAndView.addObject("host", "1111");
			return mvAndView;
	        // 加入一个属性，用来在模板中读取
		 	
	    }
}
