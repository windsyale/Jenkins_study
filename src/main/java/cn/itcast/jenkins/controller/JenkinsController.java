package cn.itcast.jenkins.controller;

import cn.itcast.jenkins.dao.bean.Student;
import cn.itcast.jenkins.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @Autowired
    private StudentService studentService;

    private int i = 0;

    @GetMapping
    @RequestMapping("hello")
//    @Scheduled(cron = "0/5 * * * * ?")
    public String hello() {
//        Student student = studentService.selectById(1);
//        System.out.println(student);
        Student student = new Student();
        student.setId(i);
        student.setName("lisi_" + i++);
        if (i == 3) {
            int j = 1/0;
        }
        studentService.insert(student);
        return "hello world";
    }
}
