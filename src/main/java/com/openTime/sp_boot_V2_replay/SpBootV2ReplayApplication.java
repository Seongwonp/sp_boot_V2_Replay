package com.openTime.sp_boot_V2_replay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // jpa auditing(듣다, 감시하다, 청강하다 등..)
public class SpBootV2ReplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpBootV2ReplayApplication.class, args);
    }

}
