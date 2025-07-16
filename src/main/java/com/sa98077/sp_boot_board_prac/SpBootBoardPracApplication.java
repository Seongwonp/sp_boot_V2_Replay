package com.sa98077.sp_boot_board_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // jpa auditing(듣다, 감시하다, 청강하다 등..)
public class  SpBootBoardPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpBootBoardPracApplication.class, args);
    }

}
