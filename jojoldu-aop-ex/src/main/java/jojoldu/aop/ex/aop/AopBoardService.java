package jojoldu.aop.ex.aop;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.Board;
import jojoldu.aop.ex.common.BoardRepository;

@Service
public class AopBoardService {

	private final BoardRepository boardRepository;

	public AopBoardService(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public void save(Board board) {
		boardRepository.save(board);
	}

	@PerfTimer
	public List<Board> findAll() {
		List<Board> boards = boardRepository.findAll();
		return boards;
	}
}
