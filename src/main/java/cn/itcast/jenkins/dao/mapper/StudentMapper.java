package cn.itcast.jenkins.dao.mapper;

import cn.itcast.jenkins.dao.bean.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
