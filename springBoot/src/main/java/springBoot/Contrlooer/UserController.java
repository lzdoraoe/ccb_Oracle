package springBoot.Contrlooer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import springBoot.bean.JsonResult;
import springBoot.bean.User;
import springBoot.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public ResponseEntity<JsonResult> getUserList() {
		JsonResult r = new JsonResult();
		try {
			List<User> users = userService.getUserList();
			r.setResult(users);
			r.setStatus("ok");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
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
