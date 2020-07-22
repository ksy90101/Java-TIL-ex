package jojoldu.aop.ex.inheritance;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.Board;

@RestController
public class InheritBoardController {
	private final InheritBoardService inheritBoardService;

	public InheritBoardController(final InheritBoardService inheritBoardService) {
		this.inheritBoardService = inheritBoardService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			inheritBoardService.save(new Board(i + "번째 게시글의 제목", i + "번째 게시글의 내용"));
		}
	}

	@GetMapping("/inherit/boards")
	public List<Board> getBoards() {
		return inheritBoardService.getData();
	}
}
