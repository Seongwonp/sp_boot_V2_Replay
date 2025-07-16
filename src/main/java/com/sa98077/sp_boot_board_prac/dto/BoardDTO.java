package com.sa98077.sp_boot_board_prac.dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

    private Long bno;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String title;
    @NotEmpty
    private String content;
    @NotEmpty
    private String writer;
    private String regDate;
    private String modDate;

}
