package jojoldu.aop.ex.aop;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.Board;

@RestController
public class AopBoardController {
	private final AopBoardService aopBoardService;

	public AopBoardController(final AopBoardService aopBoardService) {
		this.aopBoardService = aopBoardService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			aopBoardService.save(new Board(i + "번째 게시글의 제목", i + "번째 게시글의 내용"));
		}
	}

	@GetMapping("/aop/boards")
	public List<Board> getBoards() {
		return aopBoardService.findAll();
	}
}
