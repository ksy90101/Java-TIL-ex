package jojoldu.aop.ex.common;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
	History findByUserId(Long id);
}
