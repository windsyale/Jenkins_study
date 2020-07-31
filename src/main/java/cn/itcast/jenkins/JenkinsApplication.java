package cn.itcast.jenkins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.itcast.jenkins.dao.mapper")
@EnableTransactionManagement
@EnableScheduling
public class JenkinsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }
}
