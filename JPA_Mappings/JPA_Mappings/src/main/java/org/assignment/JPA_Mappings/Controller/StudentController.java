package org.assignment.JPA_Mappings.Controller;

import org.assignment.JPA_Mappings.Modal.Address;
import org.assignment.JPA_Mappings.Modal.Student;
import org.assignment.JPA_Mappings.Repository.AddressRepository;
import org.assignment.JPA_Mappings.Repository.StudentRepository;
import org.assignment.JPA_Mappings.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.*;


import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Autowired
    private AddressRepository addressRepository;

    @RequestMapping(value="/savestudent",method= RequestMethod.POST)
    public String saveStudent(@RequestBody Student student){

        Student student1=studentRepository.save(student);

        if(student1.getStudentId()>0){
            return "student saved successfully";


        }

        else{
            return "unable to save student due to some errors. Please try again !";
        }



    }

    @RequestMapping(value="/saveaddress",method=RequestMethod.POST)
    public String saveAddress(@RequestParam(name="id") int studentId,@RequestBody Address address){

        Optional<Student>student=studentRepository.findById(studentId);

        if(student.isPresent()){
            address.setStudent(student.get());
            address=addressRepository.save(address);
            if(address.getAddressId()>0){
                return "Address saved successfully";
            }
            return "Unable to save address. Please try again !!";
        }

        return "Student with studentId = "+studentId+" does not exist";



    }

    @RequestMapping(value="/savestudentwithaddress",method=RequestMethod.POST)
    public String saveStudentWithAddress(@RequestBody Student student){

        for(Address address:student.getAddressList()){
            address.setStudent(student);
        }



        try{
            student=studentRepository.save(student);
            return "Student details saved successfully !!";
        }
        catch (Exception e){
            System.out.println(e);
            return "Unable to save student details. Please try again";
        }
    }

    @RequestMapping(value="/getstudentbyid",method=RequestMethod.GET)
    public Student getStudentById(@RequestParam(name="id") int studentId){

        try{
               Student student = studentService.findByStudentId(studentId);

               //System.out.println(student);

               List<Address>addressList=student.getAddressList();

               for(Address address:addressList){
                   address.setStudent(null);
               }
               student.setAddressList(addressList);
               return student;

        }
        catch (Exception e){
            System.out.println(e);
            return new Student();
        }
    }


}
