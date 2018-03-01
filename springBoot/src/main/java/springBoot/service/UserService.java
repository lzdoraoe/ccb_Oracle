package springBoot.service;

import java.util.List;

import springBoot.bean.User;

public interface UserService {
	public List<User> getUserList();

	public void addUser(User user);
}
