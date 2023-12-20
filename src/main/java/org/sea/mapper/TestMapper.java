package org.sea.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.sea.entity.Student;

public interface TestMapper {
    @Select("select * from student where sid = 1")
    Student getStudent();

    @Insert("insert into student(name, sex) values('测试', '男')")
    void insertStudent();
}
