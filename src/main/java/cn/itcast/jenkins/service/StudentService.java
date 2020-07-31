package cn.itcast.jenkins.service;

import cn.itcast.jenkins.dao.bean.Student;
import cn.itcast.jenkins.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    public Student selectById(int id) {
        Student student = studentMapper.selectById(id);
        return student;
    }
}
