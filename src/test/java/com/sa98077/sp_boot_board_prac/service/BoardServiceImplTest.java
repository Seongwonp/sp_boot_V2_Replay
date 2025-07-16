package com.sa98077.sp_boot_board_prac.service;

import com.sa98077.sp_boot_board_prac.dto.BoardDTO;
import com.sa98077.sp_boot_board_prac.dto.BoardListReplyCountDTO;
import com.sa98077.sp_boot_board_prac.dto.PageRequestDTO;
import com.sa98077.sp_boot_board_prac.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest

class BoardServiceImplTest {

    @Autowired
    private BoardService boardService;

    @Test
    void add() {
        BoardDTO boardDTO = BoardDTO.builder()
                .title("service add title")
                .content("service add content")
                .writer("service add writer")
                .build();
        log.info("add service test {}",boardService.add(boardDTO));
    }
    @Test
    void searchOne() {
        BoardDTO boardDTO = boardService.searchOne(103L);
        log.info("searchOne service test {}",boardDTO);
    }
    @Test
    void modify() {
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(103L)
                .title("modify title")
                .content("modify content")
                .build();
        boardService.modify(boardDTO);
    }
    @Test
    void remove() {
        boardService.remove(103L);
    }
    @Test
    void getList() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .keyword("6")
                .type("tcw")
                .build();
        PageResponseDTO<BoardDTO> pageResponseDTO = boardService.getList(pageRequestDTO);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        log.info("pageResponseDTO : {}",pageResponseDTO);
        pageResponseDTO.getDtoList().forEach(log::info);

    }


    @Test
    void getListWithReplyCount() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .keyword("91")
                .type("tcw")
                .build();
        PageResponseDTO<BoardListReplyCountDTO> pageResponseDTO = boardService.getListWithReplyCount(pageRequestDTO);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        log.info("pageResponseDTO : {}",pageResponseDTO);
        pageResponseDTO.getDtoList().forEach(log::info);

    }

}