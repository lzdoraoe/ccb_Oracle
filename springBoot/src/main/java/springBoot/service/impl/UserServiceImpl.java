package springBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import springBoot.bean.User;
import springBoot.mapper.UserMapper;
import springBoot.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper  userMapper;
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

}
