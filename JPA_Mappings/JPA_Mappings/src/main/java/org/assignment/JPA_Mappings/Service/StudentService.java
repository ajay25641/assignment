package org.assignment.JPA_Mappings.Service;

import org.assignment.JPA_Mappings.Modal.Student;
import org.assignment.JPA_Mappings.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    public Student findByStudentId(int studentId){

        return studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("Student does not exist with the given Id !!"));


    }


}
