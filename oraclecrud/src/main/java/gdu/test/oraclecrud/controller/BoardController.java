package gdu.test.oraclecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import gdu.test.oraclecrud.service.BoardService;
import gdu.test.oraclecrud.vo.Board;

@Controller
public class BoardController {
	@Autowired private BoardService boardService;

	@GetMapping("/boardList")
	public String boardList(Model model) {
		List<Board> boardList = boardService.getBoardList();


		model.addAttribute("board", boardList);
		return "boardList";
	}

	@GetMapping("/boardOne/{boardId}")
	public String boardOne(Model model, @PathVariable(name = "boardId") int boardId) {
		Board board = boardService.getBoardOne(boardId);
		model.addAttribute("board", board);
		return "boardOne";
		
	}

}
