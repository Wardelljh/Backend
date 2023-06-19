package com.student.Complain.repository;

import com.student.Complain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Student,Long> {
}
