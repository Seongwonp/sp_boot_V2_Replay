package com.sa98077.sp_boot_board_prac.repository;

import com.sa98077.sp_boot_board_prac.domain.Reply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    @Query("SELECT r FROM Reply r WHERE r.board.bno = :bno")
    Page<Reply> listOfBoard(@Param("bno") Long bno, Pageable pageable);

    Long countByBoardBno(Long boardBno);
}
