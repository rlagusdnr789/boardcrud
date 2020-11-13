package gdu.test.oraclecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gdu.test.oraclecrud.service.BoardService;
import gdu.test.oraclecrud.vo.Board;

@Controller
public class BoardController {
	 @Autowired private BoardService boardService;
	
	@GetMapping("/boardList")
	public String index(Model model) {
		List<Board> boardList = boardService.getBoardList();
		
		
		model.addAttribute("board", boardList);
		
		return "boardList";
	}
}
