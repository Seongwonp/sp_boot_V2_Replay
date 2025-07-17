package com.sa98077.sp_boot_board_prac.service;

import com.sa98077.sp_boot_board_prac.dto.PageRequestDTO;
import com.sa98077.sp_boot_board_prac.dto.PageResponseDTO;
import com.sa98077.sp_boot_board_prac.dto.ReplyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReplyService {
    Long addReply(ReplyDTO replyDTO);
    PageResponseDTO<ReplyDTO> getRepliesByBoard(Long bno, PageRequestDTO pageRequestDTO);
    Long ReplyCountByBno(Long bno);
    void modifyReply(ReplyDTO replyDTO);
    void removeReply(Long rno);
    void removeRepliesByBno(Long bno);
    ReplyDTO getReply(Long rno);

}
