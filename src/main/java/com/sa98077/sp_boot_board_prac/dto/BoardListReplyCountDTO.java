package com.sa98077.sp_boot_board_prac.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BoardListReplyCountDTO {
    private Long bno;
    private String title;
    private String writer;
    private LocalDateTime regDate;

    private Long replyCount;
}
