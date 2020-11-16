package gdu.test.oraclecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gdu.test.oraclecrud.mapper.BoardMapper;
import gdu.test.oraclecrud.vo.Board;

@Service
@Transactional
public class BoardService {
		@Autowired private BoardMapper boardMapper;
		
		public List<Board> getBoardList(){
			List<Board> boardList= boardMapper.selectBoardList();
			return boardList;
		}
		public Board getBoardOne(int boardId) {
			Board boardOne = BoardMapper.selectBoardOne(boardId);
			
			return boardOne;
		}
		

}
