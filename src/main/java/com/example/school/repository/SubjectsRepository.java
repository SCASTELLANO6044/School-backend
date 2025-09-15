package com.example.school.repository;

import com.example.school.entity.SubjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<SubjectsEntity, Long> {
    SubjectsEntity findByName(String name);
    SubjectsEntity create(SubjectsEntity subjectsEntity);
    SubjectsEntity update(SubjectsEntity subjectsEntity);
}
