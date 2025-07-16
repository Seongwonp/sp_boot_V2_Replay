package com.sa98077.sp_boot_board_prac.service;

import com.sa98077.sp_boot_board_prac.dto.BoardDTO;
import com.sa98077.sp_boot_board_prac.dto.BoardListReplyCountDTO;
import com.sa98077.sp_boot_board_prac.dto.PageRequestDTO;
import com.sa98077.sp_boot_board_prac.dto.PageResponseDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    Long add(BoardDTO boardDTO); // 번호를 반환하도록 메서드 설정해보자.
    BoardDTO searchOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
    PageResponseDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO);
    PageResponseDTO<BoardListReplyCountDTO> getListWithReplyCount(PageRequestDTO pageRequestDTO);
}
