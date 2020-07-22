package jojoldu.aop.ex.aop;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.History;
import jojoldu.aop.ex.common.HistoryRepository;
import jojoldu.aop.ex.common.User;
import jojoldu.aop.ex.common.UserRepository;

@Service
public class AopUserService {

	private final UserRepository userRepository;
	private final HistoryRepository historyRepository;

	public AopUserService(final UserRepository userRepository, final HistoryRepository historyRepository) {
		this.userRepository = userRepository;
		this.historyRepository = historyRepository;
	}

	public void save(User user) {
		userRepository.save(user);
	}

	@PerfLogger
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public History findHistoryBy(Long userId){
		return historyRepository.findByUserId(userId);
	}
}
