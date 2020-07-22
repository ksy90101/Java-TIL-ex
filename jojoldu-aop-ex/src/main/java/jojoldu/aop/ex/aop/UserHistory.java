package jojoldu.aop.ex.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import jojoldu.aop.ex.common.History;
import jojoldu.aop.ex.common.HistoryRepository;
import jojoldu.aop.ex.common.User;

@Aspect
@Component
public class UserHistory {
	private final HistoryRepository historyRepository;

	public UserHistory(final HistoryRepository historyRepository) {
		this.historyRepository = historyRepository;
	}

	@Pointcut("execution(* jojoldu.aop.ex.aop.AopUserService.updateUser(*)) && args(user))")
	public void updateUser(final User user){

	}

	@AfterReturning(value = "updateUser(user)", argNames = "user")
	public void saveUser(final User user){
		historyRepository.save(new History(user.getId()));
	}
}
