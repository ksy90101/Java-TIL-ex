package jojoldu.aop.ex.Denpency;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.User;

@Primary
@Service
public class DiUserPerformance implements DiSuperService<User> {
	@Qualifier("DiUserServiceImpl")
	private final DiSuperService<User> diUserService;

	public DiUserPerformance(final DiSuperService<User> diUserService) {
		this.diUserService = diUserService;
	}

	@Override
	public List<User> getData() {
		long startTime = start();
		List<User> boards = diUserService.getData();
		end(startTime);
		return boards;
	}

	@Override
	public User save(final User user) {
		return diUserService.save(user);
	}

	private long start() {
		return System.currentTimeMillis();
	}

	private void end(long startTime) {
		long endTime = System.currentTimeMillis();
		System.out.printf("시작 시간 : %d, 끝나는 시간 %d, 총 걸리는 시간 : %d \n",
			startTime, endTime, endTime - startTime);
	}
}
