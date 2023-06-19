package com.student.Complain.controller;


import com.student.Complain.model.Student;
import com.student.Complain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/registration")
public class StudentController {

    private final UserRepository userRepository;

    @Autowired
    public StudentController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student) {
        userRepository.save(student);
        // You can add additional logic here if needed
    }


}
