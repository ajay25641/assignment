package org.assignment.JPA_Mappings.Repository;


import org.assignment.JPA_Mappings.Modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {



}
