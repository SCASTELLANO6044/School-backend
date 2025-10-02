package com.example.school.repository;

import com.example.school.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<StudentsEntity, Long> {
    StudentsEntity findByName(String name);
    StudentsEntity findByEmail(String email);
    StudentsEntity findBySchoolUlid(String schoolUlid);
}