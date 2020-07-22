package jojoldu.aop.ex.inheritance;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.User;
import jojoldu.aop.ex.common.UserRepository;

@Service
public class InheritUserService extends SuperPerformance<User> {

	private final UserRepository userRepository;

	public InheritUserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void save(User user) {
		userRepository.save(user);
	}

	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}
}
