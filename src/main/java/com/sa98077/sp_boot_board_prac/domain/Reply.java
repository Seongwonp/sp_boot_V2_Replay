package com.sa98077.sp_boot_board_prac.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="reply", indexes = {
        @Index(name="idx_reply_board_bno", columnList = "board_bno")
})
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "board")
public class Reply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    //외래키 설정
    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩
    private Board board;

    private String replyText;
    private String replyWriter;


    public void changeText(String newText){
        this.replyText = newText;
    }

}
