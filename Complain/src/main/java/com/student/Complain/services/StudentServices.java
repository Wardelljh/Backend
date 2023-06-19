package com.student.Complain.services;

import com.student.Complain.model.Student;
import com.student.Complain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    private UserRepository userRepository;

    @Autowired
    public void RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public void registerStudent(Student student) {
        userRepository.save(student);
        // You can add additional logic here if needed
    }
}
