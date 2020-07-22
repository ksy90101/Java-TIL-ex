package jojoldu.aop.ex.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.User;
import jojoldu.aop.ex.common.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void save(User user) {
		userRepository.save(user);
	}

	public List<User> findAll() {
		long startTime = System.currentTimeMillis();
		List<User> users = userRepository.findAll();
		long endTime = System.currentTimeMillis();
		System.out.printf("시작 시간 : %d, 끝나는 시간 %d, 총 걸리는 시간 : %d",
			startTime, endTime, endTime - startTime);
		return users;
	}
}
