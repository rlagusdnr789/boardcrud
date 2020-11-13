package gdu.test.oraclecrud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gdu.test.oraclecrud.vo.Board;

@Mapper
public interface BoardMapper {
	List<Board> selectBoardList();
	
	
}
