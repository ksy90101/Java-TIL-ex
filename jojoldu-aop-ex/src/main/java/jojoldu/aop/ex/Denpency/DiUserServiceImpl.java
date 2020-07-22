package jojoldu.aop.ex.Denpency;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.User;
import jojoldu.aop.ex.common.UserRepository;

@Service
public class DiUserServiceImpl implements DiSuperService<User> {
	private final UserRepository userRepository;

	public DiUserServiceImpl(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getData() {
		return userRepository.findAll();
	}

	@Override
	public User save(final User user) {
		return userRepository.save(user);
	}
}
