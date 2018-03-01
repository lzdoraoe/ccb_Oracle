package springBoot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import springBoot.bean.User;

public interface  UserMapper {
	
	@Select("SELECT * FROM user")
	public List<User> getUserList();
	@Insert("insert into user(uName,uPassword) values(#{uName},#{uPassword})")
	public void addUser(User user);
}
