package com.sa98077.sp_boot_board_prac.service;

import com.sa98077.sp_boot_board_prac.repository.ReplyRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class ReplyServiceImplTest {

    @Autowired
    private  ReplyService replyService;

    @Test
    void addReply() {
    }

    @Test
    void getRepliesByBoard() {
    }

    @Test
    void replyCountByBno() {
        log.info("Reply Count: {}",replyService.ReplyCountByBno(91L));
    }
}