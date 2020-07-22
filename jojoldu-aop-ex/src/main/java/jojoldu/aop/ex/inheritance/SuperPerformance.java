package jojoldu.aop.ex.inheritance;

import java.util.List;

public abstract class SuperPerformance<T> {
	private long start() {
		return System.currentTimeMillis();
	}

	private void end(long startTime) {
		long endTime = System.currentTimeMillis();
		System.out.printf("시작 시간 : %d, 끝나는 시간 %d, 총 걸리는 시간 : %d \n",
			startTime, endTime, endTime - startTime);
	}

	public abstract List<T> findAll();

	public List<T> getData() {
		long startTime = start();
		List<T> data = findAll();
		end(startTime);
		return data;
	}
}
