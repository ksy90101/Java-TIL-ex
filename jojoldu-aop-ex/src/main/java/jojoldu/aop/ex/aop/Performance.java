package jojoldu.aop.ex.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Performance {
	@Pointcut("@annotation(jojoldu.aop.ex.aop.PerfLogger)")
	public void perfLogger() {

	}

	@Pointcut("@annotation(jojoldu.aop.ex.aop.PerfTimer)")
	public void perfTimer() {

	}

	@Around("perfLogger() || perfTimer()")
	public Object calculatePerformanceTime(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		try {
			long startTime = System.currentTimeMillis();
			result = proceedingJoinPoint.proceed();
			long endTime = System.currentTimeMillis();

			System.out.printf("시작 시간 : %d, 끝나는 시간 %d, 총 걸리는 시간 : %d \n",
				startTime, endTime, endTime - startTime);
		} catch (Throwable throwable) {
			System.out.println(throwable.getMessage());
		}
		return result;
	}
}
