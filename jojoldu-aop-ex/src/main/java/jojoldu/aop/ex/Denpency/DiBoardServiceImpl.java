package jojoldu.aop.ex.Denpency;

import java.util.List;

import org.springframework.stereotype.Service;

import jojoldu.aop.ex.common.Board;
import jojoldu.aop.ex.common.BoardRepository;

@Service
public class DiBoardServiceImpl implements DiSuperService<Board> {
	private final BoardRepository boardRepository;

	public DiBoardServiceImpl(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@Override
	public List<Board> getData() {
		return boardRepository.findAll();
	}

	@Override
	public Board save(final Board board) {
		return boardRepository.save(board);
	}
}
