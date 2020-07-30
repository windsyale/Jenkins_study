package cn.itcast.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    @GetMapping
    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }
}
