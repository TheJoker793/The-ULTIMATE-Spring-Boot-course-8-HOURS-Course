package com.channoufi.firstRest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByFirstname(String name);
    List<Student> findByFirstnameIgnoreCase(String name);

}
