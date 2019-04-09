package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> findAll() throws Exception;

    public List<Student>  findAllStudentByid(int tid)throws Exception;

    //增
    public int addUser(Student student);
    //改
    public int update(Student student);
    //删
    public int delete(Student student);
}
