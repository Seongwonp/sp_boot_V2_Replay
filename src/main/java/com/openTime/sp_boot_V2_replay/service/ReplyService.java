package com.openTime.sp_boot_V2_replay.service;

import com.openTime.sp_boot_V2_replay.dto.PageRequestDTO;
import com.openTime.sp_boot_V2_replay.dto.PageResponseDTO;
import com.openTime.sp_boot_V2_replay.dto.ReplyDTO;

public interface ReplyService {
    Long addReply(ReplyDTO replyDTO);
    PageResponseDTO<ReplyDTO> getRepliesByBoard(Long bno, PageRequestDTO pageRequestDTO);
    Long ReplyCountByBno(Long bno);
    void modifyReply(ReplyDTO replyDTO);
    void removeReply(Long rno);
    void removeRepliesByBno(Long bno);
    ReplyDTO getReply(Long rno);

}
