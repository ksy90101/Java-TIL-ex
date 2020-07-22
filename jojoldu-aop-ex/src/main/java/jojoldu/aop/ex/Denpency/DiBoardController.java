package jojoldu.aop.ex.Denpency;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jojoldu.aop.ex.common.Board;

@RestController
public class DiBoardController {
	private final DiSuperService<Board> diBoardService;

	public DiBoardController(final DiSuperService<Board> diBoardService) {
		this.diBoardService = diBoardService;
	}

	@PostConstruct
	public void setup() {
		for (int i = 0; i < 100; i++) {
			diBoardService.save(new Board(i + "번째 게시글의 제목", i + "번째 게시글의 내용"));
		}
	}

	@GetMapping("/di/boards")
	public List<Board> getBoards() {
		return diBoardService.getData();
	}
}