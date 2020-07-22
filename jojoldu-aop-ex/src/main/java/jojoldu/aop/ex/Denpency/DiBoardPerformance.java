package jojoldu.aop.ex.Denpency;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.Board;

@Primary
@Service
public class DiBoardPerformance implements DiSuperService<Board> {
	@Qualifier("DiBoardServiceImpl")
	private final DiSuperService<Board> diBoardService;

	public DiBoardPerformance(final DiBoardServiceImpl diBoardService) {
		this.diBoardService = diBoardService;
	}

	@Override
	public List<Board> getData() {
		long startTime = start();
		List<Board> boards = diBoardService.getData();
		end(startTime);
		return boards;
	}

	@Override
	public Board save(final Board board) {
		return diBoardService.save(board);
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
