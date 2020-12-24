package com.api.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.api.board.domain.Board;
 
@Repository // dao 뜻하는 걸로 선언 약속
public interface BoardMapper {
 
    /**
     * 게시글 목록 조회
     * 
     * @return
     * @throws Exception
     */
    public List<Board> getBoardList() throws Exception;
    
    
    
    // 값 바꾸는 거 임시 나중에 바궈주기
    // update 
    public void boardInsert(Board board_writer) throws Exception;

    //게시글 수정    
    public void boardUpdate(Board board_writer) throws Exception;
    
    //게시글 삭제  
    public void boardDelete(int board_seq) throws Exception;

    
}
