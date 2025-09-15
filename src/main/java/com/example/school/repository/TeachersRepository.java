package com.example.school.repository;

import com.example.school.entity.TeachersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachersRepository extends JpaRepository<TeachersEntity, Long> {
    TeachersEntity findByName(String name);
    TeachersEntity findByEmail(String email);
    TeachersEntity findBySchoolUlid(String schoolUlid);
    TeachersEntity create(TeachersEntity teachersEntity);
    TeachersEntity update(TeachersEntity teachersEntity);
}
