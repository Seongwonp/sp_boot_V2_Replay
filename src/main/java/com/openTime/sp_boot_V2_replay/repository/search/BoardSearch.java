package com.openTime.sp_boot_V2_replay.repository.search;

import com.openTime.sp_boot_V2_replay.domain.Board;
import com.openTime.sp_boot_V2_replay.dto.BoardListReplyCountDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch{

    Page<Board> search1(Pageable pageable); // 연습용임
    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);
    Page<BoardListReplyCountDTO> searchWithReplyCount(String[] types, String keyword, Pageable pageable);
}
