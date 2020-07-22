package jojoldu.aop.ex.basic;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.Board;

@RestController
public class BoardController {
	private final BoardService boardService;

	public BoardController(final BoardService boardService) {
		this.boardService = boardService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			boardService.save(new Board(i + "번째 게시글의 제목", i + "번째 게시글의 내용"));
		}
	}

	@GetMapping("/boards")
	public List<Board> getBoards() {
		return boardService.findAll();
	}
}
