package jojoldu.aop.ex.basic;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.Board;
import jojoldu.aop.ex.common.BoardRepository;

@Service
public class BoardService {

	private final BoardRepository boardRepository;

	public BoardService(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public void save(Board board) {
		boardRepository.save(board);
	}

	public List<Board> findAll() {
		long startTime = System.currentTimeMillis();
		List<Board> boards = boardRepository.findAll();
		long endTime = System.currentTimeMillis();
		System.out.printf("시작 시간 : %d, 끝나는 시간 %d, 총 걸리는 시간 : %d \n",
			startTime, endTime, endTime - startTime);
		return boards;
	}
}
