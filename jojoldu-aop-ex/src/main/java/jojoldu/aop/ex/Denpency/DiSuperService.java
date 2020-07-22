package jojoldu.aop.ex.Denpency;

import java.util.List;

public interface DiSuperService<T> {
	List<T> getData();

	T save(T t);
}
