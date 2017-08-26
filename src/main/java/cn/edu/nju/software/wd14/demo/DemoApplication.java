package cn.edu.nju.software.wd14.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication = @Configuration+@ComponentScan+@EnableSutoConfiguration
@ComponentScan("cn.edu.nju.software.wd14.demo.*")
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("application启动成功！");
    }
}
