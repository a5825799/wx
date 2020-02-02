package cn.xdns.wx;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.xdns.wx")
public class WxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxApplication.class);
    }

}
