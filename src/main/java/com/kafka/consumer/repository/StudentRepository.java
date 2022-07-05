package com.kafka.consumer.repository;

import com.kafka.consumer.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
