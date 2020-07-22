package jojoldu.aop.ex.inheritance;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.Board;
import jojoldu.aop.ex.common.BoardRepository;

@Service
public class InheritBoardService extends SuperPerformance<Board> {

	private final BoardRepository boardRepository;

	public InheritBoardService(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public void save(Board board) {
		boardRepository.save(board);
	}

	@Override
	public List<Board> findAll() {
		return boardRepository.findAll();
	}
}
