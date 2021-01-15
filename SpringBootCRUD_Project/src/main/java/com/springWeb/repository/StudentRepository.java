package com.springWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springWeb.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
