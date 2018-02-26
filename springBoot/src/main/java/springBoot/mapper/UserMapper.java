package springBoot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import springBoot.bean.User;

public interface  UserMapper {
	
	@Select("SELECT * FROM user")
	public List<User> getUserList();
}
